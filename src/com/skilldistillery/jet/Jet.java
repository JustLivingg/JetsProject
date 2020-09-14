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

public double getRange() {
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
	System.out.println("And we are go for liftoff. " + model + " is taking off!"); 
	System.out.println((range/speed) + " hours of flight time. " + "Cost of plane: " + (price));
	System.out.println();
}

@Override
public String toString() {
	return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
}

}
