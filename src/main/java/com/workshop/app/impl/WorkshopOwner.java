package com.workshop.app.impl;

import com.workshop.app.api.DataFromJdbc;

public class WorkshopOwner implements DataFromJdbc {
	
	private int workshopOwnerID;
	private String username;
	private String password;

	public int getWorkshopOwnerID() {
		return workshopOwnerID;
	}

	public void setWorkshopOwnerID(int workshopOwnerID) {
		this.workshopOwnerID = workshopOwnerID;
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
	
}
