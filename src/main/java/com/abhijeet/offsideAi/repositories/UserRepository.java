package com.abhijeet.offsideAi.repositories;

import com.abhijeet.offsideAi.domain.entities.Chat;
import com.abhijeet.offsideAi.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
