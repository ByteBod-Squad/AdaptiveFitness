package com.bytebodsquad.server.exercisegenerator.repository

import com.bytebodsquad.server.exercisegenerator.entity.Exercise
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface ExerciseRepository : JpaRepository<Exercise, UUID> {
}