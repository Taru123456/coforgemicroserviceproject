/**
 * 
 */
package com.example.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie.model.Movie;
import com.example.movie.service.MovieService;




/**
 * @author Lenovo
 *
 */
@RestController
@RequestMapping("/movies")
public class MovieController {

	
	@Autowired
	private MovieService movieService;
	
	
	//GET
	
		@GetMapping("/movielist")
		public List<Movie> getAllUsers()
		{
			return movieService.getAllMovies();
		}
		
		
		
		
		
		
		
		//GETBYID
		@GetMapping("/getMovie/{id}")
		public ResponseEntity<Movie> getUserbyId(@PathVariable("id") Long movieId)
		{   
			Movie movie = movieService.getMoviebyId(movieId);
			return ResponseEntity.ok().body(movie);
		}
		
		//CREATE-POST
		@PostMapping("/savemovie")
		public Movie saveUser(@RequestBody Movie movie)
		{
			return movieService.saveMovie(movie);
		}
		
		
		//UPDATE-PUT
		
		@PutMapping("/updatemovie/{id}")
		public ResponseEntity<Movie> saveUser(@PathVariable("id") Long movieId,@RequestBody Movie movie)
		{
			Movie movieupdate = movieService.getMoviebyId(movieId);
			
			/*this.movie_name = movie_name;
			this.release_year = release_year;
			this.language = language;
			this.rating = rating;
			this.duration_in_minutes = duration_in_minutes;
			this.movie_type = movie_type;
			this.movie_category = movie_category;
			this.director_name = director_name;
			this.lead_actor_name1 = lead_actor_name1;
			this.lead_actor_name2 = lead_actor_name2;
			this.rental_cost = rental_cost;*/
			
			if(movie.getMovie_name() != null)
			{
				movieupdate.setMovie_name(movie.getMovie_name());
			}
			if(movie.getRelease_year() != null)
			{
				movieupdate.setRelease_year(movie.getRelease_year());
			}
			if(movie.getLanguage() != null)
			{
				movieupdate.setLanguage(movie.getLanguage());
			}
			if(movie.getRating() != null)
			{
				movieupdate.setRating(movie.getRating());
			}
			if(movie.getDuration_in_minutes() != null)
			{
				movieupdate.setDuration_in_minutes(movie.getDuration_in_minutes());
			}
			if(movie.getMovie_type() != null)
			{
				movieupdate.setMovie_type(movie.getMovie_type());
			}
			if(movie.getMovie_category() != null)
			{
				movieupdate.setMovie_category(movie.getMovie_category());
			}
			if(movie.getDirector_name() != null)
			{
				movieupdate.setDirector_name(movie.getDirector_name());
			}
			if(movie.getLead_actor_name1() != null)
			{
				movieupdate.setLead_actor_name1(movie.getLead_actor_name1());
			}
			if(movie.getLead_actor_name2() != null)
			{
				movieupdate.setLead_actor_name2(movie.getLead_actor_name2());
			}
			
				movieupdate.setRental_cost(movie.getRental_cost());
			
			
			Movie movieupated = movieService.saveMovie(movieupdate);
			
			
			return ResponseEntity.ok().body(movieupated);
		}
		
		
		
		
		
		
		//DELETE-DELETE
		@DeleteMapping("/deleteMovie/{id}")
		public ResponseEntity<?> deleteMOvie(@PathVariable("id") Long movieId)
		{
			Movie moviedelete = movieService.getMoviebyId(movieId);
		
			movieService.deletebyId(moviedelete);
			
			return ResponseEntity.ok().build();
		}
		
	
		@GetMapping("/search/{keyword}")
		public ResponseEntity<List<Movie>> searchMovie(@PathVariable("keyword") String keyword){
			return new ResponseEntity<>(movieService.searchMovie(keyword), HttpStatus.OK);
		}
	
	
	
	
	
	
	
	
	

}
