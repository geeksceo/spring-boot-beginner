package com.skanci.beginner.entities;

import com.skanci.beginner.constants.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	protected User() {}
	
	public User(String name, Role role) {
		this.name = name;
		this.role = role;
	}
	
	@Override
	public String toString() {
		return String.format(
			"User %s as %s", this.getName(), this.getRole()
		);
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Role getRole() {
		return this.role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
}
