package com.tvapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HomePageModel {

    private List<MovieSnapshot> movies;
    private List<TvSnapshot> tvShows;
}
