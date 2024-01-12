package com.bytebodsquad.server.user.entity

import com.bytebodsquad.server.exercisegenerator.entity.Exercise
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.ManyToMany
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
class Routine {
    @Id
    @UuidGenerator
    var id: UUID? = UUID.randomUUID()

    var duration: Int = 0

    @ManyToMany(mappedBy = "routine")
    var exercises: List<Exercise> ?= null
}