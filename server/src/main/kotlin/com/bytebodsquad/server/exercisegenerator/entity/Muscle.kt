package com.bytebodsquad.server.exercisegenerator.entity

import jakarta.persistence.*
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
class Muscle {
    @Id
    @UuidGenerator
    var id: String?=""

    var name: String = ""
}