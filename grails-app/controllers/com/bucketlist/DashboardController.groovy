package com.bucketlist

import org.springframework.security.access.annotation.Secured

class DashboardController {

  def springSecurityService

  @Secured('ROLE_USER')
  def index() {
     render view: 'index', model: [ username: springSecurityService.currentUser.username ]
  }
}
