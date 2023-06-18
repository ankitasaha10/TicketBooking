package com.example.TicketBooking.Convertors;

import com.example.TicketBooking.Entities.UserEntity;
import com.example.TicketBooking.EntryDtos.UserEntryDto;

public class UserEntryConverter {
    public static UserEntity entryConverter(UserEntryDto userEntityDto) {
        return UserEntity.builder().address(userEntityDto.getAddress()).age(userEntityDto.getAge()).mobNo(userEntityDto.getMobNo()).email(userEntityDto.getEmail()).userName(userEntityDto.getUserName()).build();
    }
}
