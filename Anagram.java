package week1.day1.assignments;

import java.util.Arrays;

public class Anagram {
	static void isAnagram(String str1,String str2) {
		// string1 = peek string2 = keep
		
//toCharArray() ---->method converts this string into character array. 
//It returns a newly created character array, its length is similar to this string 
//and its contents are initialized with the characters of this string.
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (Arrays.equals(ch1,ch2)) {
			 System.out.println("It is Anagram");
			}
			 else {
				 System.out.println("It is not Anagram");		
		}	
	}
	public static void main(String[] args) {
		isAnagram("peek","keep");	
	
	 }
		 
	}

