package com.example.TicketBooking.EntryDtos;

import com.example.TicketBooking.Enums.Genre;
import com.example.TicketBooking.Enums.Language;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
public class MovieEntryDto {
    private String movieName;

    private Language language;

    private Genre genre;

    private Double rating;

    private Double duration;
}
