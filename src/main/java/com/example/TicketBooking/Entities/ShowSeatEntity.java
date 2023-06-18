package com.example.TicketBooking.Entities;

import com.example.TicketBooking.Enums.SeatTypes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "showseat")
public class ShowSeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean isBooked;
    private int seatPrice;
    private  String seatsNo;
    @Enumerated(value = EnumType.STRING)
    private SeatTypes seatTypes;
    @CreationTimestamp
    private Date bookedAt;

    @JoinColumn
    @ManyToOne
    TheatreSeatEntity theatreSeatEntity;

    @JoinColumn
    @ManyToOne
    ShowEntity showEntity;
}
