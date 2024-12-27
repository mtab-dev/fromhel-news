package com.fromhelstudio.fromhel_news.application.usecases;

import com.fromhelstudio.fromhel_news.application.abstractions.IClientsRepository;
import com.fromhelstudio.fromhel_news.application.abstractions.IRemoveClientUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RemoveClientUseCase implements IRemoveClientUseCase {

    private final IClientsRepository repository;

    public RemoveClientUseCase(IClientsRepository repository){
        this.repository = repository;
    }

    @Override
    public ResponseEntity<Map<String, Object>> run (String clientId){
        var response = repository.removeClient(clientId);

        return ResponseEntity.ok(response);
    }
}
