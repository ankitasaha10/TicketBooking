package com.example.TicketBooking.Service;

import com.example.TicketBooking.Convertors.MovieEntryConverter;
import com.example.TicketBooking.Entities.MovieEntity;
import com.example.TicketBooking.EntryDtos.MovieEntryDto;
import com.example.TicketBooking.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;
    public String addMovie(MovieEntryDto movieEntryDto) {
        MovieEntity movie = MovieEntryConverter.movieEntryConvertor(movieEntryDto);
        movieRepository.save(movie);
        return "Successfully Added";
    }
}
