package com.example.TicketBooking.Convertors;

import com.example.TicketBooking.Entities.ShowEntity;
import com.example.TicketBooking.EntryDtos.ShowEntryDto;

public class ShowConvertors {


    public static ShowEntity convertEntryToEntity(ShowEntryDto showEntryDto){

        ShowEntity showEntity = ShowEntity.builder()
                .showDate(showEntryDto.getLocalDate())
                .showTime(showEntryDto.getLocalTime())
                .showType(showEntryDto.getShowType())
                .build();

        return showEntity;
    }
}
