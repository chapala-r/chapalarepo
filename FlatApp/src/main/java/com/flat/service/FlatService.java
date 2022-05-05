package com.flat.service;

import java.util.List;


import com.flat.dto.FlatRequestDto;
import com.flat.entity.Flat;

public interface FlatService {

	public List<Flat> getAllFlat();
	
	public Flat getFlatById(Long id);
	
	public Flat createFlat(FlatRequestDto request);
	
	public Flat updateFlat(FlatRequestDto request);
	
	public String deleteAll();
	
	public String deleteById(Long id);
}
