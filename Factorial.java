package week1.day1.assignments;

public class Factorial {
	
	public static void main(String[] args) {
		int fact =1;
		int factorialNum= 5;
		for(int i=1; i <= factorialNum; i++) {
		fact = fact *i;
		}
		System.out.println("Factorial of "+factorialNum+" is:" +fact);
		
		
	}

}
