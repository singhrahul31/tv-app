package com.tvapp.entity;

import java.util.Date;
import java.util.List;

public class MovieDetails {
	
	private long id;
	private String title;
	private List<Genre> genres;
	private String overview;
	private String posterPath;
	private String backdropPath;
	private Date releaseDate;
	private String tagline;
	private long voteAverage;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Genre> getGenres() {
		return genres;
	}
	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getPosterPath() {
		return posterPath;
	}
	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}
	public String getBackdropPath() {
		return backdropPath;
	}
	public void setBackdropPath(String backdropPath) {
		this.backdropPath = backdropPath;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	public long getVoteAverage() {
		return voteAverage;
	}
	public void setVoteAverage(long voteAverage) {
		this.voteAverage = voteAverage;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieDetails other = (MovieDetails) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MovieDetails [id=" + id + ", title=" + title + ", genres=" + genres + ", overview=" + overview
				+ ", posterPath=" + posterPath + ", backdropPath=" + backdropPath + ", releaseDate=" + releaseDate
				+ ", tagline=" + tagline + ", voteAverage=" + voteAverage + "]";
	}
	
	
	
	

}
