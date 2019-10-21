package com.training.myapp.model;

public class Bike {
private int bikeId;
private String bikeName;
private String bikeColour;
private double bikePrice;
public Bike() {
	super();
}
public Bike(int bikeId, String bikeName, String bikeColour, double bikePrice) {
	super();
	this.bikeId = bikeId;
	this.bikeName = bikeName;
	this.bikeColour = bikeColour;
	this.bikePrice = bikePrice;
}
public int getBikeId() {
	return bikeId;
}
public void setBikeId(int bikeId) {
	this.bikeId = bikeId;
}
public String getBikeName() {
	return bikeName;
}
public void setBikeName(String bikeName) {
	this.bikeName = bikeName;
}
public String getBikeColour() {
	return bikeColour;
}
public void setBikeColour(String bikeColour) {
	this.bikeColour = bikeColour;
}
public double getBikePrice() {
	return bikePrice;
}
public void setBikePrice(double bikePrice) {
	this.bikePrice = bikePrice;
}
@Override
public String toString() {
	return "Bike [bikeId=" + bikeId + ", bikeName=" + bikeName + ", bikeColour=" + bikeColour + ", bikePrice="
			+ bikePrice + "]";
}


}
