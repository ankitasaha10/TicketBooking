package com.example.TicketBooking.Service;




import com.example.TicketBooking.Convertors.TheaterConvertors;
import com.example.TicketBooking.Entities.MovieEntity;
import com.example.TicketBooking.Entities.ShowEntity;
import com.example.TicketBooking.Entities.TheaterEntity;
import com.example.TicketBooking.Entities.TheaterSeatEntity;
import com.example.TicketBooking.EntryDtos.TheaterEntryDto;
import com.example.TicketBooking.Enums.SeatType;
import com.example.TicketBooking.Repository.TheaterRepository;
import com.example.TicketBooking.Repository.TheaterSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TheaterService {

    @Autowired
    TheaterSeatRepository theaterSeatRepository;



    @Autowired
    TheaterRepository theaterRepository;

    public String addTheater(TheaterEntryDto theaterEntryDto)throws Exception{


        //Do some validations :
        if(theaterEntryDto.getName()==null||theaterEntryDto.getLocation()==null){
            throw new Exception("Name and location should valid");
        }

        TheaterEntity theaterEntity = TheaterConvertors.convertDtoToEntity(theaterEntryDto);
        List<TheaterSeatEntity> theaterSeatEntityList = createTheaterSeats(theaterEntryDto,theaterEntity);

        theaterEntity.setTheaterSeatEntityList(theaterSeatEntityList);
        theaterRepository.save(theaterEntity);

        return "Theater Added successfully";
    }

    private List<TheaterSeatEntity> createTheaterSeats(TheaterEntryDto theaterEntryDto,TheaterEntity theaterEntity){

        int noClassicSeats = theaterEntryDto.getClassicSeatsCount();
        int noPremiumSeats = theaterEntryDto.getPremiumSeatsCount();

        List<TheaterSeatEntity> theaterSeatEntityList = new ArrayList<>();

        //Created the classic Seats
        for(int count = 1;count<=noClassicSeats;count++){

            //We need to make a new TheaterSeatEntity
            TheaterSeatEntity theaterSeatEntity = TheaterSeatEntity.builder()
                    .seatType(SeatType.CLASSIC).seatNo(count+"C")
                    .theaterEntity(theaterEntity).build();

            theaterSeatEntityList.add(theaterSeatEntity);
        }


        //Create the premium Seats
        for(int count=1;count<=noPremiumSeats;count++){

            TheaterSeatEntity theaterSeatEntity = TheaterSeatEntity.builder().
                    seatType(SeatType.PREMIUM).seatNo(count+"P").theaterEntity(theaterEntity).build();

            theaterSeatEntityList.add(theaterSeatEntity);
        }

        //Not saving the child here
        return theaterSeatEntityList;

    }
    public List<String> getMovieInTheatre(int id){
        List<String> allMovies= new ArrayList<>();
        Optional<TheaterEntity> theaterEntity= theaterRepository.findById(id);
        if(theaterEntity.isPresent()){
            TheaterEntity theaterEntity1=theaterEntity.get();

       for(ShowEntity show: theaterEntity1.getShowEntityList()){
          MovieEntity movieEntities=show.getMovieEntity();
          allMovies.add(movieEntities.getMovieName());
       }
        }
//         List<ShowEntity> list=theaterEntity.getShowEntityList();
//       for(ShowEntity show: list){
//          MovieEntity movieEntities=show.getMovieEntity();
//          allMovies.add(movieEntities.getMovieName());
//       }
       return allMovies;
    }
}

