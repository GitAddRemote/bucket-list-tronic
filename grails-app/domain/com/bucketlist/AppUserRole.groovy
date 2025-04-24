package com.bucketlist

import grails.gorm.DetachedCriteria
import groovy.transform.ToString

import org.apache.commons.lang.builder.HashCodeBuilder

@ToString(cache=true, includeNames=true, includePackage=false)
class AppUserRole implements Serializable {

	private static final long serialVersionUID = 1

	AppUser appUser
	Role role

	AppUserRole(AppUser u, Role r) {
		this()
		appUser = u
		role = r
	}

	@Override
	boolean equals(other) {
		if (!(other instanceof AppUserRole)) {
			return false
		}

		other.appUser?.id == appUser?.id && other.role?.id == role?.id
	}

	@Override
	int hashCode() {
		def builder = new HashCodeBuilder()
		if (appUser) builder.append(appUser.id)
		if (role) builder.append(role.id)
		builder.toHashCode()
	}

	static AppUserRole get(long appUserId, long roleId) {
		criteriaFor(appUserId, roleId).get()
	}

	static boolean exists(long appUserId, long roleId) {
		criteriaFor(appUserId, roleId).count()
	}

	private static DetachedCriteria criteriaFor(long appUserId, long roleId) {
		AppUserRole.where {
			appUser == AppUser.load(appUserId) &&
			role == Role.load(roleId)
		}
	}

	static AppUserRole create(AppUser appUser, Role role, boolean flush = false) {
		def instance = new AppUserRole(appUser, role)
		instance.save(flush: flush, insert: true)
		instance
	}

	static boolean remove(AppUser u, Role r, boolean flush = false) {
		if (u == null || r == null) return false

		int rowCount = AppUserRole.where { appUser == u && role == r }.deleteAll()

		if (flush) { AppUserRole.withSession { it.flush() } }

		rowCount
	}

	static void removeAll(AppUser u, boolean flush = false) {
		if (u == null) return

		AppUserRole.where { appUser == u }.deleteAll()

		if (flush) { AppUserRole.withSession { it.flush() } }
	}

	static void removeAll(Role r, boolean flush = false) {
		if (r == null) return

		AppUserRole.where { role == r }.deleteAll()

		if (flush) { AppUserRole.withSession { it.flush() } }
	}

	static constraints = {
		role validator: { Role r, AppUserRole ur ->
			if (ur.appUser == null || ur.appUser.id == null) return
			boolean existing = false
			AppUserRole.withNewSession {
				existing = AppUserRole.exists(ur.appUser.id, r.id)
			}
			if (existing) {
				return 'userRole.exists'
			}
		}
	}

	static mapping = {
		id composite: ['appUser', 'role']
		version false
	}
}
