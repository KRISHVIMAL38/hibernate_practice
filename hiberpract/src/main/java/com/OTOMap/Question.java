package com.OTOMap;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity (name="Question")
public class Question {
	@Id
	private int questionId;
	private String quesDescription;
	
	@OneToOne
	@JoinColumn //unidirectional Mappings
	private Answer answer;

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", quesDescription=" + quesDescription + ", answer=" + answer
				+ "]";
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int questionId, String quesDescription, Answer answer) {
		super();
		this.questionId = questionId;
		this.quesDescription = quesDescription;
		this.answer = answer;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuesDescription() {
		return quesDescription;
	}

	public void setQuesDescription(String quesDescription) {
		this.quesDescription = quesDescription;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
	
}
