package com.ticketease.stadium.controller;

import com.ticketease.stadium.model.StadiumSeat;
import com.ticketease.stadium.repository.StadiumSeatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/seats")
@RequiredArgsConstructor
public class SeatController {
    private final StadiumSeatRepository repo;
    @GetMapping
    public List<StadiumSeat> all(){return repo.findAll();}
}
