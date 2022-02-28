package week1.day1.assignments;
//  1 1 2 3 5 8
public class Fibanocci {
	public static void main(String[] args) {	
	
        int val1 = 1;
        int val2 = 1;
        System.out.println(val1);
        System.out.println(val2);
        for (int i=1; i<=5; i++) {
        	int ans =val1 + val2;
        	System.out.println(ans);
        	val2 = val1;
        	val1 = ans;
        	
        }
        
	}
	
	
}
