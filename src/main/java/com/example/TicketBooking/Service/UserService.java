package com.example.TicketBooking.Service;

import com.example.TicketBooking.Convertors.UserConvertors;
import com.example.TicketBooking.Entities.UserEntity;
import com.example.TicketBooking.EntryDtos.UserEntryDto;
import com.example.TicketBooking.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto)throws Exception,NullPointerException{

        UserEntity userEntity = UserConvertors.convertDtoToEntity(userEntryDto);

        userRepository.save(userEntity);

        return "User Added successfully";

    }



}

