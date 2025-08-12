package com.abhijeet.offsideAi.repositories;

import com.abhijeet.offsideAi.domain.entities.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, UUID> {

}
