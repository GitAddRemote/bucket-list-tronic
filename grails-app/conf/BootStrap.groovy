import com.bucketlist.auth.AppUser
import com.bucketlist.auth.Role
import com.bucketlist.auth.AppUserRole

class BootStrap {

  def grailsApplication
  def authService

  def init = { servletContext ->
    def AppUser = grailsApplication.classLoader.loadClass('com.bucketlist.auth.AppUser')

    if (!AppUser.count()) {
      def userRole = Role.findOrSaveByAuthority('ROLE_USER')
      def user = AppUser.newInstance(username: 'test@example.com', password: 'password123')
      // TODO: Add proper error handling
      if (!user.save(flush: true)) {
        user.errors.allErrors.each { println it }
      }
      AppUserRole.create(user, userRole, /* flush: */ true)
    }
  }

  def destroy = {}
}
