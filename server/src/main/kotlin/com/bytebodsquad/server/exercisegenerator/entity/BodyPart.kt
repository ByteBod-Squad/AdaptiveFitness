package com.bytebodsquad.server.exercisegenerator.entity

import jakarta.persistence.*
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
@Table
class BodyPart {
    @Id
    @UuidGenerator
    var id: UUID? = null

    @Column
    var name: String = ""
}