package com.markjeffrey.dojooverflow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markjeffrey.dojooverflow.models.Question;
import com.markjeffrey.dojooverflow.models.Tag;
import com.markjeffrey.dojooverflow.repositories.QuestionRepository;

@Service
public class QuestionService {
	@Autowired
	private QuestionRepository qRepo;
	
	public List<Question> getAllQuestions(){
		return this.qRepo.findAll();
	}
	
	public Question getOneQuestion(Long id) {
		return this.qRepo.findById(id).orElse(null);
	}
	
	public Question getOneMyQuestion(String question) {
		return this.qRepo.findByMyQuestion(question);
	}
	
	public Question createQuestion(Question question) {
		return this.qRepo.save(question);
	}
	
	public Question editQuestion(Question question) {
		return this.qRepo.save(question);
	}
	
	public void deleteQuestion(Long id) {
		this.qRepo.deleteById(id);
	}
	
	public void addQuest(Tag tag, Question question) {
		if (question.getTagQuestion() == null) {
			ArrayList<Tag> tags = new ArrayList<Tag>();
			question.setTagQuestion(tags);
		}
		System.out.println(tag);
		List<Tag> addTag = question.getTagQuestion();
		addTag.add(tag);
		this.qRepo.save(question);
	}
	
	public void removeQuest(Tag tag, Question question) {
		List<Tag> remTag = question.getTagQuestion();
		remTag.remove(tag);
		this.qRepo.save(question);
	}
}
