package com.fromhelstudio.fromhel_news.infra.controllers;

import com.fromhelstudio.fromhel_news.application.abstractions.IGetAllClientsUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class GetAllClientsController {

    private final IGetAllClientsUseCase useCase;

    public GetAllClientsController(IGetAllClientsUseCase useCase){
        this.useCase = useCase;
    }

    @GetMapping("/getClients")
    public ResponseEntity<Map<String, Object>> perform(){
        return useCase.run();
    }
}
