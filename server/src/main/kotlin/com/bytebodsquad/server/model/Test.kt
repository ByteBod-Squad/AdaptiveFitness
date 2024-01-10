package com.bytebodsquad.server.model

import jakarta.persistence.*

@Entity
@Table(name="excercise")
class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long ? =null

    @Column
    var name: String = ""
}