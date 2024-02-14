package com.BookmyShow.BookMyShow.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Theatre extends BaseModel{
    private String name;
    private String address;
    private List<Screen> screens = new ArrayList<>();
    private List<Show> shows = new ArrayList<>();
}
