package com.bucketlist

class DashboardController {

  def index() {
    render "Welcome to your dashboard, user #${session.userId}"
  }
}
