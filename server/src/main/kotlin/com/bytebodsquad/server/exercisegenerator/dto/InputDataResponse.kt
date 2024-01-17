package com.bytebodsquad.server.exercisegenerator.dto

import com.bytebodsquad.server.exercisegenerator.entity.BodyArea
import com.bytebodsquad.server.exercisegenerator.entity.Equipment

data class InputDataResponse(val equipments: List<Equipment>, val bodyArea: List<BodyArea>)
