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
    @JoinTable(
        name = "main_muscle_exercise",
        joinColumns = [JoinColumn(name = "muscle_id")],
        inverseJoinColumns = [JoinColumn(name = "exercise_id")]
    )
    var mainMuscle: Muscle ?= null

    @ManyToMany
    @JoinTable(
        name = "equipment_exercise",
        joinColumns = [JoinColumn(name = "equipment_id")],
        inverseJoinColumns = [JoinColumn(name = "exercise_id")]
    )
    var equipment: List<Equipment> ?= null

    @ManyToOne
    @JoinTable(
        name = "body_area_exercise",
        joinColumns = [JoinColumn(name = "body_area_id")],
        inverseJoinColumns = [JoinColumn(name = "exercise_id")]
    )
    var targetArea: BodyArea ?= null

    @ManyToMany
    @JoinTable(
        name = "secondary_muscle_exercise",
        joinColumns = [JoinColumn(name = "muscle_id")],
        inverseJoinColumns = [JoinColumn(name = "exercise_id")]
    )
    var secondaryMuscles: List<Muscle> ?= null

    @Column(length = 1000)
    var instruction: String = ""
}