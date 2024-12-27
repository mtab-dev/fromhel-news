package com.fromhelstudio.fromhel_news.infra.controllers;

import com.fromhelstudio.fromhel_news.application.abstractions.IRemoveClientUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class RemoveClientController {
    private final IRemoveClientUseCase useCase;

    public RemoveClientController(IRemoveClientUseCase useCase){
        this.useCase = useCase;
    }

    @PostMapping("/removeClient/{clientId}")
    public ResponseEntity<Map<String, Object>> perform(@PathVariable String clientId){
        return useCase.run(clientId);
    }
}
