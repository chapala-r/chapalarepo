package com.flat.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flat.dto.FlatRequestDto;
import com.flat.entity.Flat;
import com.flat.service.FlatService;

@RestController
@RequestMapping(value="/Flat")
public class FlatController {
	
	@Autowired
	private FlatService flatService;

	@PostMapping(value="/createFlat")
	public Flat creteFlat(@RequestBody FlatRequestDto request){
		Flat flat= flatService.createFlat(request);
		return flat;
	}
	
	  @PutMapping("/updateFlat") 
	  public Flat updateFlat(@RequestBody FlatRequestDto request) { 
		  Flat flat=flatService.updateFlat(request); 
	  return flat;
	  }
	  
	  
	  @GetMapping("/findAll")
	  public List<Flat> findAll(){
		  List<Flat> flat = flatService.getAllFlat(); 
		  return flat; 
	  }
	 
	  
	  @GetMapping("/findById/{id}") 
	  public Flat findById(@PathVariable long id) {
	  Flat flat=flatService.getFlatById(id);
	  return flat;
	  }
	 
	  
	  @DeleteMapping("/delete/{id}") 
	  public String deleteById(@PathVariable long id) {
		  String msg=flatService.deleteById(id); 
		  return msg; 
		  }
	  
	  @DeleteMapping("/deleteAll")
	  public String deleteAll(){
		  String msg=flatService.deleteAll();
		  return msg;
	  }
	 }
