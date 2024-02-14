package com.BookmyShow.BookMyShow.model;

import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Show extends BaseModel{
    private Movie movie;
    private Date startTime;
    private int duration;
    private String language;
    private List<ShowSeat> showSeats = new ArrayList<>();
    private Screen screen;

}
