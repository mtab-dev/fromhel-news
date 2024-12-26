package com.fromhelstudio.fromhel_news.application.abstractions;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface IRegisterClientUseCase {
    ResponseEntity<Map<String, Object>> run(String clientName, String email);
}
