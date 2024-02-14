package com.BookmyShow.BookMyShow.model;

import com.BookmyShow.BookMyShow.enums.SeatType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Seat extends BaseModel{
    private Integer rowNo;
    private Integer columnNo;
    private SeatType seatType;
}
