package com.BookmyShow.BookMyShow.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Hall {
    String name;
    Seat[] seats;
    Show[] shows;
}
