package com.revature.transport;

public class Kayak extends Vehicle implements Steerable{
		
	private double length;
	private String color;
	
	public Kayak() {
		super();
	}

	@Override
	public String toString() {
		return "Kayak [length=" + length + ", color=" + color + "]";
	}

	public Kayak(double length, String color) {
		super();
		this.length = length;
		this.color = color;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void move() {
		System.out.println("Kayak is moving.");
	}

	@Override
	public void turnRight() {
		System.out.println("Paddle on the right.");
	}

	@Override
	public void turnLeft() {
		System.out.println("Paddle on the left.");
	}
	

}
