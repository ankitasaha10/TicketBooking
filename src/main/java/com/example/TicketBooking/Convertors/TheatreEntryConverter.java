package com.example.TicketBooking.Convertors;

import com.example.TicketBooking.Entities.TheatreEntity;
import com.example.TicketBooking.EntryDtos.TheatreEntryDto;

public class TheatreEntryConverter {
    public static TheatreEntity entryConverter(TheatreEntryDto theatreEntryDto) {
        return TheatreEntity.builder().theatreName(theatreEntryDto.getTheatreName()).location(theatreEntryDto.getLocation()).build();
    }
}
