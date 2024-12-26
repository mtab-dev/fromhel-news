package com.fromhelstudio.fromhel_news.infra.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterClientDTO {
    @NotNull
    private String clientName;

    @NotNull
    private String email;
}
