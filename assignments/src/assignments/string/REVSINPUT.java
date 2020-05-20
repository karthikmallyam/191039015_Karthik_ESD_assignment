package assignments.string;
//7.   Write a program to display the reverse of an input string 
import java.util.Scanner;

public class REVSINPUT {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String ::");
		String inputString =in.nextLine();
		StringBuilder inputString1 = new StringBuilder();
		inputString1.append(inputString);
		inputString1 = inputString1.reverse();
      System.out.println("Reversed string is :: "+inputString1);
      in.close();
	}

}

