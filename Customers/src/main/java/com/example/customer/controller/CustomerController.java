/**
 * 
 */
package com.example.customer.controller;

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

import com.example.customer.model.Customer;
import com.example.customer.model.MovieDto;
import com.example.customer.service.CustomerService;



/**
 * @author Lenovo
 *
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService custService;
	
	
	//GET
	
	@GetMapping("/custlist")
	public List<Customer> getAllCustomers()
	{
		return custService.getAllCustomers();
	}
	
	
	
	
	
	
	
	//GETBYID
	@GetMapping("/getCustomer/{id}")
	public ResponseEntity<Customer> getcustbyId(@PathVariable("id") Long userId)
	{   
		Customer user = custService.getCustomerbyId(userId);
		return ResponseEntity.ok().body(user);
	}
	
	//CREATE-POST
	@PostMapping("/savecustomer")
	public Customer save(@RequestBody Customer user)
	{
		return custService.saveCustomer(user);
	}
	
	
	//UPDATE-PUT
	
	@PutMapping("/updatecustomer/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable("id") Long userId,@RequestBody Customer user)
	{
		Customer userupdate = custService.getCustomerbyId(userId);
		/*this.customer_name = customer_name;
			this.contact_no = contact_no;
			this.contact_address = contact_address;
			this.date_of_registration = date_of_registration;
			this.age = age;*/
		
		
		
		
		
		if(user.getCustomer_name() != null)
		{
			userupdate.setCustomer_name(user.getCustomer_name());
		}
		if(user.getContact_no() != null)
		{
			userupdate.setContact_no(user.getContact_no());
		}
		if(user.getContact_address() != null)
		{
			userupdate.setContact_address(user.getContact_address());
		}
		if(user.getDate_of_registration() != null)
		{
			userupdate.setDate_of_registration(user.getDate_of_registration());
		}
		
			userupdate.setAge(user.getAge());
		
		
		
		
		
		
		
			Customer userupdated = custService.saveCustomer(userupdate);
		
		
		return ResponseEntity.ok().body(userupdated);
	}
	
	
	
	
	
	
	//DELETE-DELETE
	@DeleteMapping("/deleteCustomer/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable("id") Long userId)
	{
		Customer userdelete = custService.getCustomerbyId(userId);
	
		custService.deletebyId(userdelete);
		
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/search/movies/{keyword}")
	public ResponseEntity<List<MovieDto>> searchMovie(@PathVariable("keyword") String keyword){
		return new ResponseEntity<>(custService.searchMovies(keyword), HttpStatus.OK);
	}
	
}
