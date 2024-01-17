package com.bytebodsquad.server.exercisegenerator

import com.bytebodsquad.server.exercisegenerator.dto.InputDataResponse
import com.bytebodsquad.server.exercisegenerator.entity.Equipment
import com.bytebodsquad.server.exercisegenerator.repository.BodyAreaRepository
import com.bytebodsquad.server.exercisegenerator.repository.EquipmentRepository
import org.springframework.stereotype.Service

@Service
class ExerciseGeneratorService (val bodyAreaRepository: BodyAreaRepository, val equipmentRepository: EquipmentRepository){

    fun allInputData(): InputDataResponse {
        val equipment = equipmentRepository.findAll()
        val bodyArea = bodyAreaRepository.findAll()
        return InputDataResponse(equipment,bodyArea)
    }
}