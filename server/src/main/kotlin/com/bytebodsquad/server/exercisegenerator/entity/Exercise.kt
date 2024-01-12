package com.bytebodsquad.server.exercisegenerator.entity

import jakarta.persistence.*
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
@Table
class Exercise {
    @Id
    @UuidGenerator
    var id: UUID? = null

    var name: String = ""

    @ManyToOne
    var bodyPart: BodyPart ?= null

    @ManyToMany
    var equipment: List<Equipment> ?= null

    @ManyToOne
    var target: BodyPart ?= null

    @ManyToMany
    var secondaryMuscles: List<BodyPart> ?= null

    @Column(length = 1000)
    var instruction: String = ""
}