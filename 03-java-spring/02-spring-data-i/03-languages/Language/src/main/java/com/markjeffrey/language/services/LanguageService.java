package com.markjeffrey.language.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markjeffrey.language.models.Language;
import com.markjeffrey.language.repositories.LanguageRepository;

@Service
public class LanguageService {
	@Autowired
	private LanguageRepository lRepo;
	/*
	public LanguageService(LanguageRepository repository) {
		this.lRepo = repository;
	}
	*/
	public List<Language> getAllLanguages(){
		return this.lRepo.findAll();
	}
	
	public Language getOneLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	public Language createLanguage(Language language) {
		return this.lRepo.save(language);
	}
	
	public Language editLanguage(Language language) {
		return this.lRepo.save(language);
	}
	
	public void deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
	}
	
	
}
