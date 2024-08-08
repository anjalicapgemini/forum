package com.example.forum.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	public User(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String username;
	private String password;
	/*@OneToMany(mappedBy="author",cascade=CascadeType.ALL)
	private Set<Post> posts;*/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

}
