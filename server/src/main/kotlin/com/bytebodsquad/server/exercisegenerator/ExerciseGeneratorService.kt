package com.bytebodsquad.server.exercisegenerator

import com.bytebodsquad.server.exercisegenerator.dto.InputDataResponse
import com.bytebodsquad.server.exercisegenerator.entity.Equipment
import com.bytebodsquad.server.exercisegenerator.repository.BodyAreaRepository
import com.bytebodsquad.server.exercisegenerator.repository.EquipmentRepository
import com.bytebodsquad.server.user.repository.HealthConditionRepository
import com.bytebodsquad.server.user.repository.InjuryRepository
import org.springframework.stereotype.Service

@Service
class ExerciseGeneratorService (
    val bodyAreaRepository: BodyAreaRepository,
    val equipmentRepository: EquipmentRepository,
    val injuryRepository: InjuryRepository,
    val healthConditionRepository: HealthConditionRepository){

    fun allInputData(): InputDataResponse {
        val equipment = equipmentRepository.findAll()
        val bodyArea = bodyAreaRepository.findAll()
        val injury = injuryRepository.findAll()
        val healthCondition = healthConditionRepository.findAll()
        return InputDataResponse(equipment, bodyArea, injury, healthCondition)
    }
}