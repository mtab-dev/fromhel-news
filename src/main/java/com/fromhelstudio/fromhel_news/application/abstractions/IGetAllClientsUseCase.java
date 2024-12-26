package com.fromhelstudio.fromhel_news.application.abstractions;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface IGetAllClientsUseCase {
    ResponseEntity<Map<String, Object>> run();
}
