package com.bytebodsquad.server.exercisegenerator

import com.bytebodsquad.server.exercisegenerator.dto.InputDataResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/exercise")
class ExerciseGeneratorController (val service: ExerciseGeneratorService){

    @GetMapping("/formInputData")
    fun index() : InputDataResponse = service.allInputData()
}