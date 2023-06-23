package com.example.TicketBooking.Repository;


import com.example.TicketBooking.Entities.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<TheaterEntity,Integer> {
}

