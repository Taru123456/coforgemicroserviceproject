package com.example.customer.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.customer.model.MovieDto;

@FeignClient("movietest")
public interface FeignProxy {
	
	@GetMapping("/movies/search/{keyword}")
	public List<MovieDto> searchMovie(@PathVariable("keyword") String keyword);
	
}
