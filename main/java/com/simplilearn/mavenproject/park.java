package com.simplilearn.mavenproject;

public class park 
{
	String name; 
	String parkCode;
	String state;
	double latitude;
	double longitude;
	
	public park(String name, String parkCode, String state, double latitude, double longitude)
	{
		this.name = name + " National Park";
		this.parkCode = parkCode; 
		this.state = state;
		this.latitude = latitude;
		this.longitude = longitude;
	}
}
