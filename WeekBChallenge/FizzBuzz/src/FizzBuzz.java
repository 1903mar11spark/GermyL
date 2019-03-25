
public class FizzBuzz {
	
	
	public void fizzBuzz1() {
		
		for(int i = 1; i <=100; i++ )
		{
			if(i % 3 == 0 && i % 5 == 0)
			{
				System.out.print("fizzbuzz" + ", ");
			}
			else if(i % 3 == 0 )
			{
				System.out.print("fizz"+ ", ");
			}
			else if( i % 5 == 0)
			{
				System.out.print("buzz"+ ", ");
			}
			else {
				System.out.print(i+ ", ");
			}
		}
		System.out.println("");
	}
	
	public void fizzBuzz2(int m, int n) {		
		
		int start = m, end = n;
		//check if n is bigger start with smaller val
		if (n <= m) {
			start = n;
			end = m;
		}
			for (int i = start; i <= end; i++ ) {
				if(i % 3 == 0 && i % 5 == 0)
				{
					System.out.print("fizzbuzz" + ", ");
				}
				else if(i % 3 == 0 )
				{
					System.out.print("fizz" + ", ");
				}
				else if( i % 5 == 0)
				{
					System.out.print("buzz" + ", ");
				}
				else {
					System.out.print(i + ", ");
				}
			}
System.out.println(" ");
	}
	
	public void fizzBuzz3(int m, int n, int fizzNum, int buzzNum) {
		
		int start = m, end = n;
		//check if n is bigger start with smaller val
		if (n <= m) {
			start = n;
			end = m;
		}
			for (int i = start; i <= end; i++ ) {
				if(i % fizzNum == 0 && i % buzzNum == 0)
				{
					System.out.print("fizzbuzz" + ", ");
				}
				else if(fizzNum % 3 == 0 )
				{
					System.out.print("fizz" + ", ");
				}
				else if( buzzNum % 5 == 0)
				{
					System.out.print("buzz" + ", ");
				}
				else {
					System.out.print(i + ", ");
				}
			}
			System.out.println(" ");
		}
		
	
	public void fizzBuzz4(int m, int n, int[] numbers, String[] terms)
	{
		
		int start = m, end = n;
		//check if n is bigger start with smaller val
		if (n <= m) {
			start = n;
			end = m;
		}
		
		for(int k = start; k <= end; k++) {
			for (int i = 0; i <= numbers.length-2; i++ ) {
				
				if(k % numbers[i] == 0)
				{
				System.out.print(terms[i] + ", ");
				}
				if(k % numbers[i+1] == 0)
				{
				System.out.print(terms[i+1] + ", ");
				}
				if(k % numbers[i+1] == 0 && k % numbers[i] == 0)
				{
				System.out.print(terms[i] + terms[i+1] + ", ");
				}
				
				if (k % numbers[i+1] != 0 && k % numbers[i] != 0) {
					
				System.out.print(k + ", ");
				}
			}
			
			}
			System.out.println("");

	}
	

}
