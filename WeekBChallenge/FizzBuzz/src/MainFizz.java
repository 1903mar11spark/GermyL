
public class MainFizz {

	public static void main (String [] args) {
		FizzBuzz b = new FizzBuzz();
		int numbers[] = {3,5};
		String terms [] = {"fizz", "buzz"};
		//b.fizzBuzz1();
		
		//b.fizzBuzz2(50,45);
		//b.fizzBuzz2(45,50);
		
		//b.fizzBuzz3(1,20,2,4);
		//b.fizzBuzz3(35,20,2,4);
		
		b.fizzBuzz4(1,100,numbers,terms);
	}
}
