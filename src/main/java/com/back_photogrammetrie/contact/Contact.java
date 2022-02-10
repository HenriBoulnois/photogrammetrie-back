package com.back_photogrammetrie.contact;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Contact {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
	private String name;
	private String email;
	private String date;
	private String message;
	private boolean esttraite;
	public boolean isEsttraite() {
		return esttraite;
	}
	public Integer getId() {
		return this.id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getDate() {
		return date;
	}
	public String getMessage() {
		return message;
	}

}
