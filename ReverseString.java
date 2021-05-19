package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		
		String test = "feeling good";
		
		//Convert the String to character array
		
		char[] chararray = test.toCharArray();
		
		for (int i = (chararray.length-1); i >=0; i--) {
               System.out.print(chararray[i]);
		}
	}

}
