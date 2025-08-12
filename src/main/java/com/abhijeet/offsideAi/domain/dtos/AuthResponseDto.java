package com.abhijeet.offsideAi.domain.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Data
public class AuthResponseDto {
    private String refreshToken;
    private String accessToken;
    private String email;
    private String name;
}
