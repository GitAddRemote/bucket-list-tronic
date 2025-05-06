import com.bucketlist.location.Location
import com.bucketlist.authentication.Role
import com.bucketlist.authentication.AppUserRole

class BootStrap {

  def grailsApplication
  def authService

  def init = { servletContext ->
    def AppUser = grailsApplication.classLoader.loadClass('com.bucketlist.authentication.AppUser')

    if (!AppUser.count()) {
      def userRole = Role.findOrSaveByAuthority('ROLE_USER')
      def user = AppUser.newInstance(username: 'test@example.com', password: 'password123')
      // TODO: Add proper error handling
      if (!user.save(flush: true)) {
        user.errors.allErrors.each { println it }
      }
      AppUserRole.create(user, userRole, /* flush: */ true)

      if (Location.countByUser(user) == 0) {
        new Location(name: 'Eiffel Tower', description: 'See Paris from above', user: user).save()
        new Location(name: 'Grand Canyon', description: 'Hike the rim', user: user).save()
      }
    }
  }

  def destroy = {}
}
