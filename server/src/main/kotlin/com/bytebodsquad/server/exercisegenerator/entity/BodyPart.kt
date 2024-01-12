package com.bytebodsquad.server.exercisegenerator.entity

import jakarta.persistence.*
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
class BodyPart {
    @Id
    @UuidGenerator
    var id: UUID? = null

    var name: String = ""
}