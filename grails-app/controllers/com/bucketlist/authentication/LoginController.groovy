package com.bucketlist.authentication

class LoginController {

  AuthService authService
  def springSecurityService

  def index() {
    if (session?.userId) {
      redirect(controller: 'dashboard', action: 'index')
      return
    }
    // Safe fallback: render login view
    render view: 'index'
  }

  def authenticate() {
    def user = authService.authenticate(params.username, params.password)
    if (user) {
      session.userId = user.id
      flash.message = "Welcome back!"
      redirect(controller: 'dashboard', action: 'index')
    } else {
      flash.message = "Invalid credentials"
      redirect(action: 'index')
    }
  }

  AppUser login(String username, String rawPassword) {
    def user = AppUser.findByUsername(username)
    if (user && BCrypt.checkpw(rawPassword, user.password)) {
      // populate the SecurityContext
      springSecurityService.reauthenticate(username)
      return user
    }
    null
  }

  def logout() {
    session.invalidate()
    redirect(action: 'index')
  }
}
