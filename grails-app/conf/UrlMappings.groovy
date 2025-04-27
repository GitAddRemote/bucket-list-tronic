// grails-app/conf/UrlMappings.groovy
class UrlMappings {
  static mappings = {

    "/"(controller: 'login', action: 'index')

    "/login"(controller: 'login', action: 'index')

    "/login/authenticate"(controller: 'login', action: 'authenticate')

    "/dashboard"(controller: 'dashboard', action: 'index')
  }
}
