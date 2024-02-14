package com.BookmyShow.BookMyShow.model;

import com.BookmyShow.BookMyShow.enums.Language;
import com.BookmyShow.BookMyShow.enums.MovieFeatures;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Movie extends BaseModel{
    private String name;
    private double rating;
    private List<Language> languages = new ArrayList<>();
    private List<MovieFeatures> features = new ArrayList<>();
}
