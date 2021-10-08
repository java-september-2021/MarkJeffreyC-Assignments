package com.markjeffrey.dojooverflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markjeffrey.dojooverflow.models.Tag;
import com.markjeffrey.dojooverflow.repositories.TagRepository;

@Service
public class TagService {
	@Autowired
	private TagRepository tRepo;
	
	public List<Tag> getAllTags(){
		return this.tRepo.findAll();
	}
	
	public Tag getOneTag(Long id) {
		return this.tRepo.findById(id).orElse(null);
	}
	
	public Tag getOneMyTag(String tag) {
		return this.tRepo.findByMyTag(tag);
	}
	
	public Tag createTag(Tag tag) {
		return this.tRepo.save(tag);
	}
	
	public Tag editTag(Tag tag) {
		return this.tRepo.save(tag);
	}
	
	public void deleteTag(Long id) {
		this.tRepo.deleteById(id);
	}
	
	public boolean doesTagExist(String tag) {
		return this.tRepo.existsByMyTag(tag);
	}
}
