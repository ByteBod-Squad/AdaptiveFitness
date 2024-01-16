package com.bytebodsquad.server.user.entity

import jakarta.persistence.*
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

    @ManyToMany
    @JoinTable(
        name = "user_health_condition",
        joinColumns = [JoinColumn(name = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "health_condition_id")]
    )
    var healthCondition: List<HealthCondition> ?= null

    @ManyToMany
    @JoinTable(
        name = "user_injury",
        joinColumns = [JoinColumn(name = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "injury_id")]
    )
    var injury: List<Injury> ?= null

    @ManyToMany
    @JoinTable(
        name = "user_routine",
        joinColumns = [JoinColumn(name = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "routine_id")]
    )
    var routine: List<Routine> ?= null
}