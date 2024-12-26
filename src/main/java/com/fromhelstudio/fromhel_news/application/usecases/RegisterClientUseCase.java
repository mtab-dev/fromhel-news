package com.fromhelstudio.fromhel_news.application.usecases;

import com.fromhelstudio.fromhel_news.application.abstractions.IClientsRepository;
import com.fromhelstudio.fromhel_news.application.abstractions.IRegisterClientUseCase;
import com.fromhelstudio.fromhel_news.application.utils.GenerateID;
import com.fromhelstudio.fromhel_news.domain.entities.ClientEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class RegisterClientUseCase implements IRegisterClientUseCase {

    private final IClientsRepository repository;

    public RegisterClientUseCase(IClientsRepository repository) {
        this.repository = repository;
    }


    @Override
    public ResponseEntity<Map<String, Object>> run(String clientName, String email){

        ClientEntity newClient = new ClientEntity();

        newClient.setClientId(GenerateID.generate());
        newClient.setClientName(clientName);
        newClient.setEmail(email);
        newClient.setRegisteredAt(LocalDateTime.now());

        var response = repository.registerClient(newClient);
        return ResponseEntity.ok(response);
    };
}
