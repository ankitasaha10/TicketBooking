package com.example.TicketBooking.EntryDtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class TheatreEntryDto {
    private String theatreName;

    private String location;
    private int standardSeats;
    private int reclinerSeats;
    private int sofaSeats;
    private int vipSeats;
}
