package week1.day1.assignments;

public class FindType {
public static void main(String[] args) {
	
	String input = "$$ Welcome to 2nd class of Automation";
	int num=0, letter=0, space =0, specialChar =0;
	char CharGet;
	boolean letterstatus,numstatus,spacestatus;
	
	   for(int i=0;i< input.length();i++) {
		   CharGet = input.charAt(i);
		   letterstatus =Character.isLetter(CharGet);
		   numstatus =Character.isDigit(CharGet);
		   spacestatus=Character.isSpaceChar(CharGet);
		   
		   if (letterstatus== true) {
			   letter++;
		   	}else if(numstatus==true){
			   num++;
		    }else if (spacestatus==true){
			   space++;
		   }else{
			   specialChar++;			   
		   }
		    
	   }
	    System.out.println("Number of letters are " + letter);
		System.out.println("Number of white space are " + space);
		System.out.println("Number of numbers are " + num);
		System.out.println("Number of special characters are " + specialChar);
}
}
