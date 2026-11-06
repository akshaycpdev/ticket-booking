package com.ticketease.event.controller;

import com.ticketease.event.model.Event;
import com.ticketease.event.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/events")
@RequiredArgsConstructor
public class EventController {
    private final EventRepository eventRepository;

    @GetMapping
    public List<Event> getAll() { return eventRepository.findAll(); }

    @GetMapping("/{id}")
    public Event getById(@PathVariable Long id) { return eventRepository.findById(id).orElse(null); }
}
