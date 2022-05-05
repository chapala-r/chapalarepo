package com.flat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flat.dto.FlatRequestDto;
import com.flat.entity.Flat;
import com.flat.repository.FlatRepository;
import com.flat.service.FlatService;
@Service
public class FlatServiceImpl implements FlatService{
	
	@Autowired
	private FlatRepository flatRepository;

	@Override
	public List<Flat> getAllFlat() {
		try {
			return flatRepository.findAll();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Flat getFlatById(Long id) {
		try {
			return flatRepository.findById(id).get();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Flat createFlat(FlatRequestDto request) {
		Flat flat=new Flat();
		flat.setCity(request.getCity());
		flat.setFlatNo(request.getFlatNo());
		flat.setLocation(request.getLocation());
		flat.setName(request.getName());
		flat.setPrice(request.getPrice());
		flat.setType(request.getType());
		try {
			return flatRepository.save(flat);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Flat updateFlat(FlatRequestDto request) {
		Flat flat=new Flat();
		flat.setId(request.getId());
		flat.setCity(request.getCity());
		flat.setFlatNo(request.getFlatNo());
		flat.setLocation(request.getLocation());
		flat.setName(request.getName());
		flat.setPrice(request.getPrice());
		flat.setType(request.getType());
		try {
			return flatRepository.save(flat);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String deleteAll() {
		try {
			 flatRepository.deleteAll();
			 return "All Flat deleted successfully";
		}catch(Exception e) {
			e.printStackTrace();
			return "Deletion Failed!";
		}
	}

	@Override
	public String deleteById(Long id) {
		try {
			flatRepository.deleteById(id);
			 return "Flat deleted successfully";
		}catch(Exception e) {
			e.printStackTrace();
			return "Deletion Failed!";
		}
	}

}
