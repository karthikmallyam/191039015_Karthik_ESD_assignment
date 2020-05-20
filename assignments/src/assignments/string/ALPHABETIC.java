package assignments.string;
//3.   Allow the user to enter a string and display the string in alphabetic order and find the length of string. 
import java.util.Arrays;
import java.util.Scanner; 

public class ALPHABETIC {
	public static String sortString(String inputString) 
	{ 
		char tempArray[] = inputString.toCharArray(); 
		Arrays.sort(tempArray);
		return new String(tempArray); 
	}
	public static void main(String[] args) 
	{ 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String ::");
		String inputString=in.nextLine();
		int len = inputString.length();
		String outputString = sortString(inputString); 
		
		System.out.println("Input String : " + inputString); 
		System.out.println("Output String : " + outputString); 
		System.out.println("Length of "+inputString+" is " + len);
		in.close();
	} 
} 
