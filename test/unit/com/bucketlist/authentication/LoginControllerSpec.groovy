// File: test/unit/com/bucketlist/authentication/LoginControllerSpec.groovy
package com.bucketlist.authentication

import grails.plugin.springsecurity.SpringSecurityService
import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(LoginController)
@Mock([AppUser, Role, AppUserRole])
class LoginControllerSpec extends Specification {

  def springSecurityService = Mock(SpringSecurityService) {
    // ensure encodePassword never returns null
    encodePassword(_ as String) >> { String raw -> raw }
  }
  def authService = Mock(AuthService)

  void setup() {
    controller.springSecurityService = springSecurityService
    controller.authService           = authService

    // seed a ROLE_USER and a test AppUser
    new Role(authority: 'ROLE_USER').save(flush: true, failOnError: true)
    AppUser.withNewSession {
      new AppUser(
        username: 'testuser',
        password: 'password',    // matches what encodePassword('password') returns
        enabled:  true
      ).save(flush: true, failOnError: true)
    }
    AppUserRole.create(
      AppUser.findByUsername('testuser'),
      Role.findByAuthority('ROLE_USER'),
      true
    )
  }

  void "successful login with valid credentials"() {
    given: "AuthService returns the real user for good creds"
    authService.authenticate('testuser','password') >> AppUser.findByUsername('testuser')

    when:
    request.method = 'POST'
    params.username = 'testuser'
    params.password = 'password'
    controller.authenticate()

    then:
    response.redirectedUrl == '/dashboard'
    flash.message.toLowerCase().contains('welcome')
  }

  void "login fails with invalid credentials"() {
    given: "AuthService returns null for bad creds"
    authService.authenticate('testuser','wrong') >> null

    when:
    request.method = 'POST'
    params.username = 'testuser'
    params.password = 'wrong'
    controller.authenticate()

    then:
    response.redirectedUrl == '/'
    flash.message.toLowerCase().contains('invalid')
  }
}
