package com.OTMMap;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name="answer1")
public class Answer {	
	@Id
	private int answerId;
	private String ansDescription;
	
	@ManyToOne
	Question question;

	public Answer(int answerId, String ansDescription, Question question) {
		super();
		this.answerId = answerId;
		this.ansDescription = ansDescription;
		this.question = question;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnsDescription() {
		return ansDescription;
	}

	public void setAnsDescription(String ansDescription) {
		this.ansDescription = ansDescription;
	}

	public Question getQuestion() {
		return question;
	}

	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", ansDescription=" + ansDescription + ", question=" + question + "]";
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
}
