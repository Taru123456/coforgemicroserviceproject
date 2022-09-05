package com.example.customer.model;

public class MovieDto {
	
    private long movie_id;

    private String movie_name;

    private String release_year;

    private String language;
    
    private String rating;
    
    private String duration_in_minutes;

    private String movie_type;

    private String movie_category;
    
    private String director_name;

    private String lead_actor_name1;

    private String lead_actor_name2;
    
    private int rental_cost;

    
    public MovieDto(){};    
    
	public MovieDto(String movie_name, String release_year, String language, String rating, String duration_in_minutes,
			String movie_type, String movie_category, String director_name, String lead_actor_name1,
			String lead_actor_name2, int rental_cost) {
		super();
		this.movie_name = movie_name;
		this.release_year = release_year;
		this.language = language;
		this.rating = rating;
		this.duration_in_minutes = duration_in_minutes;
		this.movie_type = movie_type;
		this.movie_category = movie_category;
		this.director_name = director_name;
		this.lead_actor_name1 = lead_actor_name1;
		this.lead_actor_name2 = lead_actor_name2;
		this.rental_cost = rental_cost;
	}

	public long getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(long movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getRelease_year() {
		return release_year;
	}

	public void setRelease_year(String release_year) {
		this.release_year = release_year;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDuration_in_minutes() {
		return duration_in_minutes;
	}

	public void setDuration_in_minutes(String duration_in_minutes) {
		this.duration_in_minutes = duration_in_minutes;
	}

	public String getMovie_type() {
		return movie_type;
	}

	public void setMovie_type(String movie_type) {
		this.movie_type = movie_type;
	}

	public String getMovie_category() {
		return movie_category;
	}

	public void setMovie_category(String movie_category) {
		this.movie_category = movie_category;
	}

	public String getDirector_name() {
		return director_name;
	}

	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}

	public String getLead_actor_name1() {
		return lead_actor_name1;
	}

	public void setLead_actor_name1(String lead_actor_name1) {
		this.lead_actor_name1 = lead_actor_name1;
	}

	public String getLead_actor_name2() {
		return lead_actor_name2;
	}

	public void setLead_actor_name2(String lead_actor_name2) {
		this.lead_actor_name2 = lead_actor_name2;
	}

	public int getRental_cost() {
		return rental_cost;
	}

	public void setRental_cost(int rental_cost) {
		this.rental_cost = rental_cost;
	}
}
