package com.client.ws.rasmooplus.infra.gateways.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreditCardDTO {
    private Long cvv;

    private String documentNumber;

    private Long installments;

    private Long month;

    private String number;

    private Long year;
}
