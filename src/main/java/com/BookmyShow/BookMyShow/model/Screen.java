package com.BookmyShow.BookMyShow.model;

import com.BookmyShow.BookMyShow.enums.MovieFeatures;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Screen {
    private String name;
    private List<Seat> seats = new ArrayList<>();
    private List<MovieFeatures> features = new ArrayList<>();
}
