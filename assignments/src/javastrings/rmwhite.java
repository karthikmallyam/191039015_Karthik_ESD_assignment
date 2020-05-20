package javastrings;
//5. Java Program to Remove the White Spaces 
import java.util.Scanner;

public class rmwhite {
	public static void main(String[] args) 
	{ 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String with spaces ::");
		String str=in.nextLine();
		str = str.replaceAll("\\s", ""); 
		System.out.println(str);
		in.close();
	} 
} 
