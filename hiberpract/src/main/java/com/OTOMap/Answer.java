package com.OTOMap;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name="answer")
public class Answer {
	@Id
	private int answrId;
	private String ansdescription;
	@OneToOne
	private Question question;
	public int getAnswrId() {
		return answrId;
	}
	public void setAnswrId(int answrId) {
		this.answrId = answrId;
	}
	public String getAnsdescription() {
		return ansdescription;
	}
	public void setAnsdescription(String ansdescription) {
		this.ansdescription = ansdescription;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Answer(int answrId, String ansdescription, Question question) {
		super();
		this.answrId = answrId;
		this.ansdescription = ansdescription;
		this.question = question;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Answer [answrId=" + answrId + ", ansdescription=" + ansdescription + ", question=" + question + "]";
	}
	
	
}
