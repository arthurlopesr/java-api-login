package com.client.ws.rasmooplus.presentation.controllers;

import com.client.ws.rasmooplus.domain.entities.jpa.SubscriptionsTypeEntity;
import com.client.ws.rasmooplus.presentation.dto.SubscriptionTypeDTO;
import com.client.ws.rasmooplus.useCases.SubscriptionTypeUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscription-type")
public class SubscriptionTypeController {

    @Autowired
    private SubscriptionTypeUseCase subscriptionTypeUseCase;

    @GetMapping
    public ResponseEntity<List<SubscriptionsTypeEntity>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeUseCase.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubscriptionsTypeEntity> findById(@PathVariable("id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeUseCase.findById(id));
    }

    @PostMapping
    public ResponseEntity<SubscriptionsTypeEntity> create(@Valid @RequestBody SubscriptionTypeDTO subscriptionsTypeDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(subscriptionTypeUseCase.create(subscriptionsTypeDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SubscriptionsTypeEntity> update(@PathVariable("id") Long id, @Valid @RequestBody SubscriptionTypeDTO subscriptionsTypeDto) {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeUseCase.update(id, subscriptionsTypeDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        subscriptionTypeUseCase.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }
}