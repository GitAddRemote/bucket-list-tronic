package com.bucketlist.location

import com.bucketlist.authentication.AppUser

class Location {
    String   name
    String   description
    Boolean  visited = false

    // link each Location to the owning AppUser
    static belongsTo = [user: AppUser]

    static constraints = {
        name        blank: false, maxSize: 100
        description nullable: true, maxSize: 500
        visited     nullable: false
    }
}
