// test/unit/com/bucketlist/dashboard/DashboardControllerSpec.groovy
package com.bucketlist.dashboard

import grails.plugin.springsecurity.SpringSecurityService
import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

import com.bucketlist.authentication.AppUser
import com.bucketlist.location.Location

@TestFor(DashboardController)
@Mock([AppUser, Location])
class DashboardControllerSpec extends Specification {

  def springSecurityService = Mock(SpringSecurityService)

  void setup() {
    controller.springSecurityService = springSecurityService
  }

  void "dashboard returns username when authenticated"() {
    given:
    def user = new AppUser(username:'u1', password:'x', enabled:true)
      .save(flush:true, failOnError:true)
    springSecurityService.isLoggedIn() >> true
    springSecurityService.currentUser   >> user
    // locations can be empty here, since we're only testing username
    when:
    def model = controller.index()
    then:
    model.username == user.username
  }
}
