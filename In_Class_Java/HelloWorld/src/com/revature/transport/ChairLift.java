package com.revature.transport;

public class ChairLift extends Vehicle {

		private double lengthInMeters;
		private int gondolaCount;
		

		public ChairLift() {
			super();
		}

		public ChairLift(double lengthInMeters, int gondolaCount) {
			super();
			this.lengthInMeters = lengthInMeters;
			this.gondolaCount = gondolaCount;
		}

		public double getLengthInMeters() {
			return lengthInMeters;
		}

		public void setLengthInMeters(double lengthInMeters) {
			this.lengthInMeters = lengthInMeters;
		}

		public int getGondolaCount() {
			return gondolaCount;
		}

		public void setGondolaCount(int gondolaCount) {
			this.gondolaCount = gondolaCount;
		}
		@Override
		public void move() {
			System.out.println("The ChairLift is moving.");
		}

		@Override
		public String toString() {
			return "ChairLift [lengthInMeters=" + lengthInMeters + ", gondolaCount=" + gondolaCount + "]";
		}
}
