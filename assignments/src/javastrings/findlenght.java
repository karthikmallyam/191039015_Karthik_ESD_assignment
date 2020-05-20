package javastrings;

//3. Java Program to Find the Length of the String 
import java.util.Scanner;

public class findlenght {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String ::");
		String str=in.nextLine();
		int len = str.length();
		System.out.println("Length of "+str+" is " + len);
		in.close();
	}

}
