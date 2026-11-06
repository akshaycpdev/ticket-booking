package com.ticketease.booking.repository;
import com.ticketease.booking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookingRepository extends JpaRepository<Booking, Long> {}
