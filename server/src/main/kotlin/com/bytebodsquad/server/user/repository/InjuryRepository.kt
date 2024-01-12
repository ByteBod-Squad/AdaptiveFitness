package com.bytebodsquad.server.user.repository

import com.bytebodsquad.server.user.entity.Injury
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface InjuryRepository : JpaRepository<Injury, UUID> {
}