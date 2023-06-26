package com.example.TicketBooking.Controller;

import com.example.TicketBooking.EntryDtos.TheaterEntryDto;
import com.example.TicketBooking.Service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/theater")
public class TheaterController {

    @Autowired
    TheaterService theaterService;

    @PostMapping("/add")
    public ResponseEntity addTheater(@RequestBody TheaterEntryDto theaterEntryDto){

        try{
            String result = theaterService.addTheater(theaterEntryDto);
            return new ResponseEntity(result, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }



    }

    @GetMapping("/getMovieInTheatre")
    public List<String>  getMovieInTheatre(@RequestParam("id") int id){
        return theaterService.getMovieInTheatre(id);
    }
}
