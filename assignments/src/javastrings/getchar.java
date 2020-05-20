package javastrings;
//2. Java Program to check if a Given String is getChar from Specific Index 
import java.util.Scanner;

public class getchar {

	public static char
	getCharFromString(String str, int index) 
	{ 
		return str.charAt(index); 
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String ::");
		String str=in.nextLine();
		System.out.println("Enter the index Number ::");
		int index =in.nextInt();
		char ch = getCharFromString(str, index);
		System.out.println("Character from " + str + " at index " + index + " is " + ch); 
		in.close();
		}
}