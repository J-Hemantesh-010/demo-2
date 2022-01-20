package com.example.demo.entity;

@Entity
public class User {
	@Id
	@GeneratedValue(startegy= GenerationType.AUTO)

	Private Intger id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
