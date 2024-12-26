package com.fromhelstudio.fromhel_news.infra.controllers;

import com.fromhelstudio.fromhel_news.application.abstractions.IRegisterClientUseCase;
import com.fromhelstudio.fromhel_news.infra.dtos.RegisterClientDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class RegisterClientController {

    private final IRegisterClientUseCase useCase;

    public RegisterClientController(final IRegisterClientUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping("/register/")
    public ResponseEntity<Map<String, Object>> perform(@RequestBody RegisterClientDTO dto){
        return useCase.run(dto.getClientName(), dto.getEmail());
    }
}
