package com.bytebodsquad.server.user.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.ManyToMany
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
class User {
    @Id
    @UuidGenerator
    var id: UUID? = UUID.randomUUID()

    var name: String = ""

    var gender: String =""

    var age: Int = 0

    var height: Int = 0

    var weight: Int = 0

    var fitnessLevel: String =""

    @ManyToMany(mappedBy = "user")
    var healthCondition: List<HealthCondition> ?= null

    @ManyToMany(mappedBy = "user")
    var injury: List<Injury> ?= null

    @ManyToMany(mappedBy = "user")
    var routine: List<Routine> ?= null
}