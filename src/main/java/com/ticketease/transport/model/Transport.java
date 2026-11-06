package com.ticketease.transport.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "transport")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type; // BUS, TRAIN, METRO
    private String name; // e.g., Airavat Club Class, Shatabdi Express
    private String origin;
    private String destination;
    private BigDecimal fare;
}
