package com.BookmyShow.BookMyShow.model;

import com.BookmyShow.BookMyShow.enums.SeatStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeat extends  BaseModel{
   private Seat seat;
   private Show show;
   private SeatStatus seatStatus;
}
