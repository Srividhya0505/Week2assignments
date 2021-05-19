package week2.day2;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
		String[] splitext = test.split(" ");
		System.out.println(Arrays.toString(splitext));
		String newword = "";
		
	for (int i = 0; i <=splitext.length; i++) {
     		    if (i%2==1) {
     		    	 newword = newword + new StringBuilder(splitext[i]).reverse().toString()+" ";
     		    }
     		    	 else {
     		    	newword = newword + splitext[i] + " ";
		           
				}
     		   newword = newword.trim();
     		    System.out.println(newword);      
	}
	
	}

}
