package com.revature.transport;

public class Car extends Vehicle implements Steerable {
	
		private int yearManufactured;
		private String make, model;
		
		public Car() {
			super();
		}

		public Car(int yearManufactured, String make, String model) {
			super();
			this.yearManufactured = yearManufactured;
			this.make = make;
			this.model = model;
		}

		public int getYearManufactured() {
			return yearManufactured;
		}

		public void setYearManufactured(int yearManufactured) {
			this.yearManufactured = yearManufactured;
		}

		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		@Override
		public void move() {
			System.out.println("Car is moving.");
		}
		
		@Override
		public String toString() {
			return "Car [yearManufactured=" + yearManufactured + ", make=" + make + ", model=" + model + "]";
		}

		@Override
		public void turnRight() {
			System.out.println("Truning wheel clockwise.");
		}

		@Override
		public void turnLeft() {
			System.out.println("Turning wheel counter-clockwise.");
		}

		
}
