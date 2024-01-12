package com.bytebodsquad.server.exercisegenerator.repository

import com.bytebodsquad.server.exercisegenerator.entity.BodyPart
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface BodyPartRepository : JpaRepository<BodyPart, UUID> {
}