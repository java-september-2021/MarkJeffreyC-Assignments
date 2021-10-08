package com.markjeffrey.dojooverflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markjeffrey.dojooverflow.models.Answer;
import com.markjeffrey.dojooverflow.repositories.AnswerRepository;


@Service
public class AnswerService {
	@Autowired
	private AnswerRepository aRepo;
	
	public List<Answer> getAllAnswers(){
		return this.aRepo.findAll();
	}
	
	public Answer getOneAnswer(Long id) {
		return this.aRepo.findById(id).orElse(null);
	}
	
	public Answer createAnswer(Answer answer) {
		return this.aRepo.save(answer);
	}
	
	public Answer editAnswer(Answer answer) {
		return this.aRepo.save(answer);
	}
	
	public void deleteAnswer(Long id) {
		this.aRepo.deleteById(id);
	}
}
