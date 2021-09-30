package com.markjeffrey.dojoninja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markjeffrey.dojoninja.models.Dojo;
import com.markjeffrey.dojoninja.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dRepo;
	
	public List<Dojo> getAllDojos(){
		return this.dRepo.findAll();
	}
	
	public Dojo getOneDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	public Dojo createDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
	public Dojo editDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
	public void deleteDojo(Long id) {
		this.dRepo.deleteById(id);
	}
}
