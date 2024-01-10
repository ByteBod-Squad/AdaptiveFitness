package com.bytebodsquad.server.model

import jakarta.persistence.*

@Entity
@Table
class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long ? = null

    @Column
    var name: String = ""
}