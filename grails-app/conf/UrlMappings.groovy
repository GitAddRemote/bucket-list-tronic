// grails-app/conf/UrlMappings.groovy
class UrlMappings {
  static mappings = {

    "/"(controller: 'login', action: 'index')
    "/login"(controller: 'login', action: 'index')
    "/login/authenticate"(controller: 'login', action: 'authenticate')
    "/dashboard"(controller: 'dashboard', action: 'index')

    // ◀── add this back in ──▶
    "/$controller/$action?/$id?" {
      constraints {
        // apply constraints here if you wish
      }
    }

    // error mappings (optional, but recommended)
    "500"(view: '/error')
    "404"(view: '/notFound')
  }
}
