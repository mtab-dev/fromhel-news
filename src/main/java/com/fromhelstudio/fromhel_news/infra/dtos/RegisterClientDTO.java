package com.fromhelstudio.fromhel_news.infra.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class RegisterClientDTO {
    @NotNull
    private String clientName;

    @NotNull
    private String email;

    public String getClientName(){
        return clientName;
    }

    public String getEmail(){
        return email;
    }


}
