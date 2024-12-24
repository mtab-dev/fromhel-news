package com.fromhelstudio.fromhel_news.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "clients")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {
    private String clientId;
    private String clientName;
    private String email;
    private LocalDateTime registeredAt;
}
