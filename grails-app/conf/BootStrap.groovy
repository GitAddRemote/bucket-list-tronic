class BootStrap {

  def grailsApplication
  def authService

  def init = { servletContext ->
    def AppUser = grailsApplication.classLoader.loadClass('com.bucketlist.auth.AppUser')

    if (!AppUser.count()) {
//      def password = authService.hashPassword('password123')
      def user = AppUser.newInstance(username: 'test@example.com', password: 'password123')
      // TODO: Add proper error handling
      if (!user.save(flush: true)) {
        user.errors.allErrors.each { println it }
      }
    }
  }

  def destroy = {}
}
