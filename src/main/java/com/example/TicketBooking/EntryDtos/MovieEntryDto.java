package com.example.TicketBooking.EntryDtos;

import com.example.TicketBooking.Enums.Genre;
import com.example.TicketBooking.Enums.Language;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class MovieEntryDto {

    private String movieName;

    private double ratings;

    private int duration;

    private Language language;

    private Genre genre;

}
