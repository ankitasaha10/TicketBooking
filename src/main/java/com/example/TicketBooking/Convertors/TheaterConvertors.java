package com.example.TicketBooking.Convertors;

import com.example.TicketBooking.Entities.TheaterEntity;
import com.example.TicketBooking.EntryDtos.TheaterEntryDto;

public class TheaterConvertors {


    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        return TheaterEntity.builder().location(theaterEntryDto.getLocation())
                .name(theaterEntryDto.getName()).build();

    }

}