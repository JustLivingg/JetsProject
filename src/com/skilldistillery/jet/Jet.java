package com.skilldistillery.jet;

public class Jet {
private String model;
private double speed;
private int range;
private long price;

public Jet() {
	super();
	// TODO Auto-generated constructor stub
}

public Jet(String model, double speed, int range, long price) {
	super();
	this.model = model;
	this.speed = speed;
	this.range = range;
	this.price = price;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public double getSpeed() {
	return speed;
}

public void setSpeed(double speed) {
	this.speed = speed;
}

public int getRange() {
	return range;
}

public void setRange(int range) {
	this.range = range;
}

public long getPrice() {
	return price;
}

public void setPrice(long price) {
	this.price = price;
}

public void fly() {
	
}

public double getSpeedInMach() {
	return 0.0;
	
}

}