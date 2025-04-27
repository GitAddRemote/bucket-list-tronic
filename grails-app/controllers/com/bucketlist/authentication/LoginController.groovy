package com.bucketlist.authentication

class LoginController {

  AuthService authService

  def index() {
    if (session?.userId) {
      redirect(controller: 'dashboard', action: 'index')
      return
    }
    // Safe fallback: render login view
    render view: 'index'
  }

  def authenticate() {
    def user = authService.login(params.username, params.password)
    if (user) {
      session.userId = user.id
      flash.message = "Welcome back!"
      redirect(controller: 'dashboard', action: 'index')
    } else {
      flash.message = "Invalid credentials"
      redirect(action: 'index')
    }
  }

  def logout() {
    session.invalidate()
    redirect(action: 'index')
  }
}
