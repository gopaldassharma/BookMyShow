package com.BookmyShow.BookMyShow.model;

import com.BookmyShow.BookMyShow.enums.BookingStatus;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ticket {
    private double amount;
    private List<ShowSeat> seats = new ArrayList<>();
    private User user;
    private BookingStatus bookingStatus;
    private Date bookedAt;
    private List<Payment> paymentList = new ArrayList<>();
}
