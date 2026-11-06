package com.ticketease.transport.controller;

import com.ticketease.transport.model.Transport;
import com.ticketease.transport.repository.TransportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/transport")
@RequiredArgsConstructor
public class TransportController {
    private final TransportRepository transportRepository;

    @GetMapping("/search")
    public List<Transport> search(@RequestParam String origin, @RequestParam String destination) {
        return transportRepository.findByOriginAndDestination(origin, destination);
    }
}
