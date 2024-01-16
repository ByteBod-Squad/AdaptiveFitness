package com.bytebodsquad.server.exercisegenerator.repository

import com.bytebodsquad.server.exercisegenerator.entity.BodyArea
import com.bytebodsquad.server.exercisegenerator.entity.Equipment
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface BodyAreaRepository : JpaRepository<BodyArea, String> {
}