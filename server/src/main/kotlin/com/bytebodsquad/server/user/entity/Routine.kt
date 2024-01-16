package com.bytebodsquad.server.user.entity

import com.bytebodsquad.server.exercisegenerator.entity.Exercise
import jakarta.persistence.*
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
class Routine {
    @Id
    @UuidGenerator
    var id: UUID? = UUID.randomUUID()

    var duration: Int = 0

    @ManyToMany
    @JoinTable(
        name = "routine_exercise",
        joinColumns = [JoinColumn(name = "routine_id")],
        inverseJoinColumns = [JoinColumn(name = "exercise_id")]
    )
    var exercises: List<Exercise> ?= null
}