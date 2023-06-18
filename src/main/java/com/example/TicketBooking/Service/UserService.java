package com.example.TicketBooking.Service;

import com.example.TicketBooking.Convertors.UserEntryConverter;
import com.example.TicketBooking.Entities.UserEntity;
import com.example.TicketBooking.EntryDtos.UserEntryDto;
import com.example.TicketBooking.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String addUser(UserEntryDto userEntityDto) {
        UserEntity user = UserEntryConverter.entryConverter(userEntityDto);
        userRepository.save(user);
        return "User Added Successfully";
    }
}
