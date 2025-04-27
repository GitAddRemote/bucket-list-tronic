package com.bucketlist.authentication

import com.bucketlist.auth.AppUser
import grails.transaction.Transactional
import org.springframework.security.crypto.bcrypt.BCrypt
import org.apache.commons.logging.LogFactory

@Transactional
class AuthService {
  private static final log = LogFactory.getLog(this)

  def springSecurityService

  /**
   * Attempt to authenticate a user by username (email) and raw password.
   * @return the AppUser if credentials match, otherwise null
   */
  AppUser authenticate(String username, String rawPassword) {
    if (!username || !rawPassword) {
      log.warn "Login attempt with empty username or password"
      return null
    }

    AppUser user = AppUser.findByUsername(username)
    if (user) {
      String storedHash = user.password  // adjust if your domain uses a different field
      if (BCrypt.checkpw(rawPassword, storedHash)) {
        // populate the SecurityContext
        springSecurityService.reauthenticate(username)
        log.info  "User [$username] authenticated successfully"
        return user
      }
      // Small constant delay to mitigate timing attacks
      Thread.sleep(50)
    } else {
      // Simulate a hash check so attackers can’t enumerate valid usernames by timing
      BCrypt.checkpw(rawPassword, BCrypt.gensalt())
    }

    log.warn "Invalid credentials for user: [$username]"
    return null
  }

  /**
   * Perform logout by invalidating the HTTP session.
   */
  void logout(session) {
    session?.invalidate()
    log.info "Session invalidated for logout"
  }
}
