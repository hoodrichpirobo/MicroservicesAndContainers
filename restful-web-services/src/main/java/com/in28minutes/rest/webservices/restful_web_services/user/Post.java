package com.in28minutes.rest.webservices.restful_web_services.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.*; 
import com.fasterxml.jackson.annotation.*;

@Entity
public class Post {
	@Id
	@GeneratedValue
	private Integer id;
	@Size(min = 10)
	private String description;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private User user;
	
	public int getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "Post [id=" + id + ", description=" + description + "]";
	}
}
