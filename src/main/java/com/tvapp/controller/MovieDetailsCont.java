package com.tvapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tvapp.entity.MovieSnapshot;
import com.tvapp.service.MovieDetailService;

@RestController("/")
public class MovieDetailsCont {
	
	@Autowired
	MovieDetailService movieDetailsCont;
	
	@GetMapping("movie/{movieId}")
	public MovieSnapshot getMovieDetails(@PathVariable long movieId) {
		
		return movieDetailsCont.getMovieDetails(movieId);
		
	}

}
