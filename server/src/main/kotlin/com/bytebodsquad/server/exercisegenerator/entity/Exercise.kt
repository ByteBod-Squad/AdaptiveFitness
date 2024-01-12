package com.bytebodsquad.server.exercisegenerator.entity

import jakarta.persistence.*
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
class Exercise {
    @Id
    @UuidGenerator
    var id: UUID? = UUID.randomUUID()

    var name: String = ""

    @ManyToOne
    var mainMuscle: BodyPart ?= null

    @ManyToMany(mappedBy = "exercise")
    var equipment: List<Equipment> ?= null

    @ManyToOne
    var target: BodyPart ?= null

    @ManyToMany(mappedBy = "exercise")
    var secondaryMuscles: List<BodyPart> ?= null

    @Column(length = 1000)
    var instruction: String = ""
}