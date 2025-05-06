// grails-app/controllers/com/bucketlist/dashboard/DashboardController.groovy
package com.bucketlist.dashboard

import com.bucketlist.location.Location
import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_USER')
class DashboardController {

  def springSecurityService

  def index() {
    if (!springSecurityService.isLoggedIn()) {
      redirect controller:'login', action:'index'
      return
    }
    def user = springSecurityService.currentUser
    def locations = Location.findAllByUser(user)
    [ username: user.username,
      locations: locations ]
  }
}
