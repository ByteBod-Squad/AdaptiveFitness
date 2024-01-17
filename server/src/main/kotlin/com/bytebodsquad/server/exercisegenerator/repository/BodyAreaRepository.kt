package com.bytebodsquad.server.exercisegenerator.repository

import com.bytebodsquad.server.exercisegenerator.entity.BodyArea
import org.springframework.data.jpa.repository.JpaRepository

interface BodyAreaRepository : JpaRepository<BodyArea, String> {
    fun findByName(name: String): BodyArea?
}