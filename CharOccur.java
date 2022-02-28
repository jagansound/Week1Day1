package week1.day1.assignments;

public class CharOccur{
	public static void main(String[] args) {
		

		String name = "Jagadeesh";
		char input = 'e';
		char charget;
		int count = 0;
				
		for(int i=0; i < name.length(); i++)  {
			charget = name.charAt(i);
			if(input == charget){	
				count++;
			}		
			
		}	
		System.out.println("Number of e occurance in Jagadeesh: " + count);
		
	}	
}
	


