/**
 * 
 */
package com.example.movie.service;

import java.util.List;

import com.example.movie.model.Movie;

/**
 * @author Lenovo
 *
 */
public interface MovieService {

	//crud operations
	
			//GET
			
			public List<Movie> getAllMovies();
			
			//GETBYID
			
			public Movie getMoviebyId(Long movieid);
			
			//CREATE
			
			public Movie saveMovie(Movie movie);
			
			
			//UPDATE-ID
			public Movie updateMovie(Long movieid);
			//DELETE
			public boolean deletebyId(Movie movie);
			public List<Movie> searchMovie(String keyword);

}
