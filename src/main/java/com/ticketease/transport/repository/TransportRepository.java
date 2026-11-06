package com.ticketease.transport.repository;

import com.ticketease.transport.model.Transport;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TransportRepository extends JpaRepository<Transport, Long> {
    List<Transport> findByOriginAndDestination(String origin, String destination);
}
