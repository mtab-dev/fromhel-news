package com.fromhelstudio.fromhel_news.application.abstractions;

import com.fromhelstudio.fromhel_news.domain.entities.ClientEntity;

import java.util.Map;

public interface IClientsRepository {
    Map<String, Object> getAllClients();
    Map<String, Object> registerClient(ClientEntity client);
}
