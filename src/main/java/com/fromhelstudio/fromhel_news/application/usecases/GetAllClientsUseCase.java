package com.fromhelstudio.fromhel_news.application.usecases;

import com.fromhelstudio.fromhel_news.application.abstractions.IClientsRepository;
import com.fromhelstudio.fromhel_news.application.abstractions.IGetAllClientsUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class GetAllClientsUseCase implements IGetAllClientsUseCase {
    private final IClientsRepository repository;

    public GetAllClientsUseCase(IClientsRepository repository){
        this.repository = repository;
    }

    @Override
    public ResponseEntity<Map<String, Object>> run(){
        var response = repository.getAllClients();
        return ResponseEntity.ok(response);
    }
}
