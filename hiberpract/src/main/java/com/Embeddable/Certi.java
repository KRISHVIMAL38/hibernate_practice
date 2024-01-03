package com.Embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

@Embeddable
public class Certi {
	@Column(name="certi_name")
	private String certi_name;
	@Column(name="Certi_duration")
	private int duration;
	public String getCerti_name() {
		return certi_name;
	}
	public void setCerti_name(String certi_name) {
		this.certi_name = certi_name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Certi(String certi_name, int duration) {
		super();
		this.certi_name = certi_name;
		this.duration = duration;
	}
	public Certi() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Certi [certi_name=" + certi_name + ", duration=" + duration + "]";
	}
	
	
}
