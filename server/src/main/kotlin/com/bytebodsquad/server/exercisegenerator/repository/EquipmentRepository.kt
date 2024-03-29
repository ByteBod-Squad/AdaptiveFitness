package com.bytebodsquad.server.exercisegenerator.repository

import com.bytebodsquad.server.exercisegenerator.entity.Equipment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EquipmentRepository : JpaRepository<Equipment, String> {
    fun findByName(name: String): Equipment?
}