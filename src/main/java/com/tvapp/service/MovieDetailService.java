package com.tvapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tvapp.entity.MovieSnapshot;

@Service
public class MovieDetailService {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${base.url}")
	private String baseUrl;
	
	@Value("${api.key}")
	private String apiKey;
	
	public MovieSnapshot getMovieDetails(long movieId) {
		String url = baseUrl+"/movie/"+movieId+"?api_key="+apiKey;
		System.out.println(url);
		return restTemplate.getForObject(url, MovieSnapshot.class);
		
	}

}
