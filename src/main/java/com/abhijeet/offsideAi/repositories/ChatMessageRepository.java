package com.abhijeet.offsideAi.repositories;

import com.abhijeet.offsideAi.domain.entities.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, UUID> {
}

