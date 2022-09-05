/**
 * 
 */
package com.example.movie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.movie.model.Movie;



/**
 * @author Lenovo
 *
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie,Long>{
	@Query("select u from Movie u where u.movie_type=?1")
	public List<Movie> searchMovie(String keyword);
	

}
