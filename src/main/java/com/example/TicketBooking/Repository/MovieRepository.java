package com.example.TicketBooking.Repository;

import com.example.TicketBooking.Entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity, String> {
}
