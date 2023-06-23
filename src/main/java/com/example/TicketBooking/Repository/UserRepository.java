package com.example.TicketBooking.Repository;

import com.example.TicketBooking.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
