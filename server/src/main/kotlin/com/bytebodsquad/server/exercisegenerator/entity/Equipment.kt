package com.bytebodsquad.server.exercisegenerator.entity


import jakarta.persistence.*
import org.hibernate.annotations.UuidGenerator


@Entity
class Equipment {
    @Id
    @UuidGenerator
    var id: String ?= ""

    var name: String = ""
}