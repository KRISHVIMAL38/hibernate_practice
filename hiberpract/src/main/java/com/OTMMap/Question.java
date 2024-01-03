package com.OTMMap;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="question1")
public class Question {
	@Id
	private int questionId;
	private String quesDescription;
	
	@OneToMany(mappedBy = "question")
	List<Answer>answer;

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

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	public Question(int questionId, String quesDescription, List<Answer> answer) {
		super();
		this.questionId = questionId;
		this.quesDescription = quesDescription;
		this.answer = answer;
	}

	public Question() {
		super();
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", quesDescription=" + quesDescription + ", answer=" + answer
				+ "]";
	}
	
	
}
