package com.example.TicketBooking.Convertors;

import com.example.TicketBooking.Entities.ShowEntity;
import com.example.TicketBooking.EntryDtos.ShowEntryDto;

public class ShowEntryConverter {
    public static ShowEntity entryConverter(ShowEntryDto showEntryDto) {
        return ShowEntity.builder().localTime(showEntryDto.getLocalTime()).localDate(showEntryDto.getLocalDate()).showType(showEntryDto.getShowType()).seatPrice(showEntryDto.getSeatPrice()).build();
    }
}