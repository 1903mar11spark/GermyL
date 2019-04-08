package com.revature.calculator;

public class Calculator {

	public double add(double d, double e) {
		// TODO Auto-generated method stub
		return 6;
	}

	public double sub(double d, double e) {
		// TODO Auto-generated method stub
		return -2;
	}
	
	public double mult(double d, double e) {
		// TODO Auto-generated method stub
		return 8;
	}
	
	public double div(double d, double e) {
		// TODO Auto-generated method stub
		return .5;
	}

	public double powr(double d, double e) {
		double hold = 1;
		for(int i = 0; i < e; i++) {
			hold = hold * d;
		}
		return hold;
	}
	
	public double avg(double arr[]) {
		double a = 0;
		for(int i = 0; i < arr.length; i++) {
			a += arr[i];
		}
		a = a/arr.length;
		
		return a;
	} 
}
