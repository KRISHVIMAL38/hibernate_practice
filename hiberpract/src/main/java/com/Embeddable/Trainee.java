package com.Embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Trainee")
public class Trainee {
	@Id
	@Column(name="trainee_id")
	private int trainee_id;
	@Column(name="Trainee_name")
	private String trainee_name;
	private Certi certi;
	public int getTrainee_id() {
		return trainee_id;
	}
	public void setTrainee_id(int trainee_id) {
		this.trainee_id = trainee_id;
	}
	public String getTrainee_name() {
		return trainee_name;
	}
	public void setTrainee_name(String trainee_name) {
		this.trainee_name = trainee_name;
	}
	public Certi getCerti() {
		return certi;
	}
	public void setCerti(Certi certi) {
		this.certi = certi;
	}
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainee(int trainee_id, String trainee_name, Certi certi) {
		super();
		this.trainee_id = trainee_id;
		this.trainee_name = trainee_name;
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Trainee [trainee_id=" + trainee_id + ", trainee_name=" + trainee_name + ", certi=" + certi + "]";
	}
}
