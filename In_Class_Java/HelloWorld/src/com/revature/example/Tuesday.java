package com.revature.example;
import java.util.ArrayList;
import java.util.List;

import com.revature.transport.*; //does nothing except saves us typing
import com.revature.transport.Car;
import com.revature.transport.ChairLift;
import com.revature.transport.Kayak;
import com.revature.transport.Steerable;
import com.revature.transport.Vehicle;

public class Tuesday {

		public static void main (String [] args) {
			System.out.println("Hi");
			funWithWrapperClasses();
			funWithTransport();
		}
		
		static void funWithTransport()
		{	//using fully qualified class name to refer to Kayak. This Always works.s
			com.revature.transport.Kayak k = new com.revature.transport.Kayak(3.3,"red");
			
			//using import statement
			Kayak k2 = new Kayak(4.5, "blue");
			
			Car c = new Car(1999, "Mazda", "Miata");
			Car c2 = new Car(2010, "Tesla", "Model S");
			ChairLift c11 = new ChairLift(12, 950);
			
			//create and populate list of vehicles
			List<Vehicle> vehicles = new ArrayList();
			vehicles.add(k2);
			vehicles.add(c);
			vehicles.add(k);
			vehicles.add(c11);
			vehicles.add(c2);
			
			for (Vehicle v : vehicles) {
				System.out.println(v);
				v.move();
				if(v instanceof Steerable) {
					((Steerable) v).turnLeft();
				}
			}
			
			}
		static void funWithWrapperClasses() {
			
			//int valued primitive
			byte b = 5;
			short s = 6;
			int i = 7;
			long l = 8l;
			
			
			Integer j = i; //autoboxing
			b = new Byte((byte) 9);	//narrowing conversion
			
			//String to number conversions
			String str = "55.4";
			Double d = Double.parseDouble(str);
			d = 77.4;
			
			//check type of d
			System.out.println(d.getClass());
			boolean isDouble = (d instanceof java.lang.Double);
			System.out.println(isDouble);
			
			
		}
}
