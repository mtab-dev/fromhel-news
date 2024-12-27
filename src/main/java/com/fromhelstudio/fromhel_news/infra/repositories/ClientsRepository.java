package com.fromhelstudio.fromhel_news.infra.repositories;

import com.fromhelstudio.fromhel_news.application.abstractions.IClientsRepository;
import com.fromhelstudio.fromhel_news.domain.entities.ClientEntity;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ClientsRepository implements IClientsRepository {

    private final MongoTemplate mongo;

    public ClientsRepository(MongoTemplate mongo) {
        this.mongo = mongo;
    }

    @Override
    public Map<String, Object> getAllClients(){

        Query query = new Query();

        List<ClientEntity> documents = mongo.find(query, ClientEntity.class, "clients");

        Map<String, Object> response = new HashMap<>();

        response.put("clients", documents.toArray());

        return response;
    };

    @Override
    public Map<String, Object> registerClient(ClientEntity clientEntity){
        var data = mongo.insert(clientEntity);

        Map<String, Object> response = new HashMap<>();

        response.put("client", data);
        response.put("status", "success");

        return response;
    }

    @Override
    public Map<String, Object> removeClient(String clientId){

        Query query = new Query();
        query.addCriteria(Criteria.where("clientId").is(clientId));

        var data = mongo.remove(query, ClientEntity.class, "clients");

        Map<String, Object> response = new HashMap<>();

        response.put("status", "success");
        response.put("client", data);

        return response;
    }
}
