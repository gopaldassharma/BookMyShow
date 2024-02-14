package com.BookmyShow.BookMyShow.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class City extends BaseModel{
    String name;
    List<Theatre> theatreList = new ArrayList<>();
}
