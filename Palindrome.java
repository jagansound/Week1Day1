package week1.day1.assignments;
//import java.lang.*;

public class Palindrome {
	
 
    public static void main(String args[])
    {   
    	
    	String str1 = "liril";
    	System.out.println("To check the palindrome String for " + str1);
    	StringBuffer sbf = new StringBuffer(str1);
    	sbf.reverse();
    	String str2 = sbf.toString();   
    	if(str1.equals(str2)) {     	
        System.out.println("Given String is palindrome "+ str2);
    	}
    	else
    	{       
        System.out.println("Given String is not palindrome ");
    	}
    }
}