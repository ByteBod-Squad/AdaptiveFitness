package com.bytebodsquad.server.repository;

import com.bytebodsquad.server.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise,Long> {
}
