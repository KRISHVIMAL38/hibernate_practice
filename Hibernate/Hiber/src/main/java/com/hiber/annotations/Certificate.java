package com.hiber.annotations;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certificate {
	private int certiId;
	private String certiName;
	public int getCertiId() {
		return certiId;
	}
	public void setCertiId(int certiId) {
		this.certiId = certiId;
	}
	public String getCertiName() {
		return certiName;
	}
	public void setCertiName(String certiName) {
		this.certiName = certiName;
	}
	public Certificate(int certiId, String certiName) {
		super();
		this.certiId = certiId;
		this.certiName = certiName;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Certificate [certiId=" + certiId + ", certiName=" + certiName + "]";
	}
	
}
