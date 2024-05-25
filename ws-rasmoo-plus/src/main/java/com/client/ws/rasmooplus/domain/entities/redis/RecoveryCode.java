package com.client.ws.rasmooplus.domain.entities.redis;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.time.LocalDateTime;

@RedisHash("recoveryCode")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecoveryCode {

    @Id
    private String recoveryCodeId;

    private String email;

    private String code;

    private LocalDateTime createdAt = LocalDateTime.now();
}
