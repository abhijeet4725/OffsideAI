package com.abhijeet.offsideAi.domain.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Data
public class RegisterRequestDto {
    private String name;
    private String email;
    private String password;
}
