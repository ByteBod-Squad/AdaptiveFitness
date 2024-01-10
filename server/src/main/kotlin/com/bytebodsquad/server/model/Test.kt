package com.bytebodsquad.server.model

import jakarta.persistence.*

@Entity
@Table
class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @Column
    var name: String = ""
}