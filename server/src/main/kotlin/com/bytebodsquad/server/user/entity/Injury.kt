package com.bytebodsquad.server.user.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
class Injury {
    @Id
    @UuidGenerator
    var id: String ?= ""

    var name: String = ""

    var duration: String = ""
}