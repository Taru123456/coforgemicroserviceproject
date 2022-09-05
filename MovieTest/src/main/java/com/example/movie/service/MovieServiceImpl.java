/**
 * 
 */
package com.example.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movie.model.Movie;
import com.example.movie.repository.MovieRepository;




/**
 * @author Lenovo
 *
 */
@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieRepository movierepo;
	
	
	
	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return this.movierepo.findAll();
	}

	@Override
	public Movie getMoviebyId(Long movieid) {
		// TODO Auto-generated method stub
		return this.movierepo.findById(movieid).get();
	}

	@Override
	public Movie saveMovie(Movie movie) {
		// TODO Auto-generated method stub
		return this.movierepo.save(movie);
	}

	@Override
	public Movie updateMovie(Long movieid) {
		// TODO Auto-generated method stub
		Movie movie=this.movierepo.findById(movieid).get();
		
		return this.movierepo.save(movie);
	}

	@Override
	public boolean deletebyId(Movie movie) {
		// TODO Auto-generated method stub
		this.movierepo.delete(movie);
		return true;
	}

	@Override
	public List<Movie> searchMovie(String keyword) {
		// TODO Auto-generated method stub
		
			
			return this.movierepo.searchMovie(keyword);
		}
	

	
		

}
