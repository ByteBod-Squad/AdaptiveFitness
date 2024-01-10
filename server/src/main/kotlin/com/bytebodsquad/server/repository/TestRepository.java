package com.bytebodsquad.server.repository;

import com.bytebodsquad.server.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test,Long> {
}
