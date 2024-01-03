package com.map;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name="question_name")
	private int questionId;
	private String question;
	@OneToMany (mappedBy = "q")
	private List<Answer>list;
	
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer> getList() {
		return list;
	}
	public void setList(List<Answer> list) {
		this.list = list;
	}
	public Question(int questionId, String question, List<Answer> list) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.list = list;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", list=" + list + "]";
	}
	
	
}
