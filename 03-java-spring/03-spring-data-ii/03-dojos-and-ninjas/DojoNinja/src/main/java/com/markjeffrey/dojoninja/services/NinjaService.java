package com.markjeffrey.dojoninja.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markjeffrey.dojoninja.models.Ninja;
import com.markjeffrey.dojoninja.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository nRepo;
	
	public Ninja getOneNinja(Long id) {
		return this.nRepo.findById(id).orElse(null);
	}
	
	public Ninja create(Ninja ninja) {
		return this.nRepo.save(ninja);
	}

	public Ninja editNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
	
	public void deleteNinja(Long id) {
		this.nRepo.deleteById(id);
	}
}
