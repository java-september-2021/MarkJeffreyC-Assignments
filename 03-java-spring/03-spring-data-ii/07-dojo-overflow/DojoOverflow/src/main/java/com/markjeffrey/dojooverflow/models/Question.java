package com.markjeffrey.dojooverflow.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="questions")
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String myQuestion;
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyy-MM-DD HH:mm:ss")
	private Date createdAt;
	@DateTimeFormat(pattern="yyy-MM-DD HH:mm:ss")
	private Date updatedAt;
	
	@OneToMany(mappedBy="questionAnswer", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Answer> answer;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="tags_question",
			joinColumns = @JoinColumn(name="question_id"),			
			inverseJoinColumns = @JoinColumn(name="tag_id")
			)
	private List<Tag> tagQuestion;
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	public Question() {
	}

	public Question(@NotBlank String myQuestion) {
		this.myQuestion = myQuestion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMyQuestion() {
		return myQuestion;
	}

	public void setMyQuestion(String myQuestion) {
		this.myQuestion = myQuestion;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	public List<Tag> getTagQuestion() {
		return tagQuestion;
	}

	public void setTagQuestion(List<Tag> tagQuestion) {
		this.tagQuestion = tagQuestion;
	}
	
	
}
