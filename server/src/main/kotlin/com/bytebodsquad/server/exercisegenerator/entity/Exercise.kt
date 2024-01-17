package com.bytebodsquad.server.exercisegenerator.entity

import jakarta.persistence.*
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
class Exercise {
    @Id
    @UuidGenerator
    var id: String ?= ""

    var name: String = ""

    var difficulty: String = ""

    @ManyToOne
    @JoinTable(
        name = "body-part_exercise",
        joinColumns = [JoinColumn(name = "body-part_id")],
        inverseJoinColumns = [JoinColumn(name = "exercise_id")]
    )
    var mainMuscle: Muscle ?= null

    @ManyToOne
    @JoinTable(
        name = "equipment_exercise",
        joinColumns = [JoinColumn(name = "equipment_id")],
        inverseJoinColumns = [JoinColumn(name = "exercise_id")]
    )
    var equipment: Equipment ?= null

    @ManyToOne
    @JoinTable(
        name = "body-area_exercise",
        joinColumns = [JoinColumn(name = "body-area_id")],
        inverseJoinColumns = [JoinColumn(name = "exercise_id")]
    )
    var targetArea: BodyArea ?= null

    @ManyToOne
    @JoinTable(
        name = "body-part_exercise",
        joinColumns = [JoinColumn(name = "body-part_id")],
        inverseJoinColumns = [JoinColumn(name = "exercise_id")]
    )
    var secondaryMuscle: Muscle ?= null

    @Column(length = 1000)
    var instruction: String = ""
}