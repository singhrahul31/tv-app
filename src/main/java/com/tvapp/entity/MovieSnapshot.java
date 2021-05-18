package com.tvapp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieSnapshot {
	
	private long id;

	@JsonProperty("title")
	private String title;


	@JsonProperty("poster_path")
	private String posterPath;


	@JsonProperty("vote_average")
	private float voteAverage;

}
