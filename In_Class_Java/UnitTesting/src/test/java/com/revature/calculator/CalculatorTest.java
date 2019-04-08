package com.revature.calculator;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class CalculatorTest {

	private Calculator calc = new Calculator();
	
	@Test
	public void addTest() {
		assertTrue(calc.add(2d, 4d) == 6d);
		assertThat(calc.add(2d,4d), is(equalTo(6d)));
	}
	@Test
	public void subTest() {
		assertTrue(calc.sub(2d, 4d) == -2d);
		assertThat(calc.sub(2d,4d), is(equalTo(-2d)));
	}
	
	@Test
	public void multTest() {
		assertTrue(calc.mult(2d, 4d) == 8d);
		assertThat(calc.mult(2d,4d), is(equalTo(8d)));
	}
	
	@Test
	public void divTest() {
		assertTrue(calc.div(2d, 4d) == .5d);
		assertThat(calc.div(2d,4d), is(equalTo(.5d)));
	}
	@Test
	public void powTest() {
		assertTrue(calc.powr(2d, 4d) == 16d); 
		assertThat(calc.powr(2d,4d), is(equalTo(16d)));
	}
	
	@Test
	public void avgTest() {
		double arr [] = {2,2,2};
		assertTrue(calc.avg(arr) == 2d);
		assertThat(calc.avg(arr), is(equalTo(2d)));
	}
}
