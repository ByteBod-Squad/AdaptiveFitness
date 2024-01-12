package com.bytebodsquad.server.exercisegenerator.entity


import jakarta.persistence.*
import org.hibernate.annotations.UuidGenerator
import java.util.UUID


@Entity
@Table
class Equipment {
    @Id
    @UuidGenerator
    var id: UUID ? = null

    @Column
    var name: String = ""
}