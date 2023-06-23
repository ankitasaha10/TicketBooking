package com.example.TicketBooking.Service;

import com.example.TicketBooking.Convertors.MovieConvertors;
import com.example.TicketBooking.Entities.MovieEntity;
import com.example.TicketBooking.EntryDtos.MovieEntryDto;
import com.example.TicketBooking.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieEntryDto movieEntryDto)throws Exception{


        MovieEntity movieEntity = MovieConvertors.convertEntryDtoToEntity(movieEntryDto);

        movieRepository.save(movieEntity);

        return "Movie Added successfully";


    }

}
