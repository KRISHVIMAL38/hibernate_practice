package com.queries;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="animal1")
public class Animal {
	@Id
	private int animalId;
	private String category;
	private String name;
	public int getAnimalId() {
		return animalId;
	}
	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal(int animalId, String category, String name) {
		super();
		this.animalId = animalId;
		this.category = category;
		this.name = name;
	}
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Animal [animalId=" + animalId + ", category=" + category + ", name=" + name + "]";
	}
	
	
}
