package com.ticketease.stadium.repository;

import com.ticketease.stadium.model.StadiumSeat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StadiumSeatRepository extends JpaRepository<StadiumSeat, Long> {}
