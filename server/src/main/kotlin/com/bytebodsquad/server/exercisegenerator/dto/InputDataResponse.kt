package com.bytebodsquad.server.exercisegenerator.dto

import com.bytebodsquad.server.exercisegenerator.entity.BodyArea
import com.bytebodsquad.server.exercisegenerator.entity.Equipment
import com.bytebodsquad.server.user.entity.HealthCondition
import com.bytebodsquad.server.user.entity.Injury

data class InputDataResponse(
    val equipments: List<Equipment>,
    val bodyArea: List<BodyArea>,
    val injury: List<Injury>,
    val healthCondition: List<HealthCondition>
)
