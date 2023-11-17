package com.glca.app.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String title;

	private String shortDescription;

	private String createdDate;

	public Object getCreatedDate() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCreatedDate(Object createdDate2) {
		// TODO Auto-generated method stub
		
	}

	public Object getShortDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setShortDescription(Object shortDescription2) {
		// TODO Auto-generated method stub
		
	}

	public Object getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setTitle(Object title2) {
		// TODO Auto-generated method stub
		
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

}

