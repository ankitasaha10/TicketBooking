package com.example.TicketBooking.EntryDtos;

import com.example.TicketBooking.Enums.ShowType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
@AllArgsConstructor
public class ShowEntryDto {
    private LocalDate localDate;
    private LocalTime localTime;
    private int theatreId;
    private String movieId;
    private ShowType showType;
    private int seatPrice;
}
