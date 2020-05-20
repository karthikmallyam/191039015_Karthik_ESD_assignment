package javastrings;
import java.util.Scanner;

public class split {
	public static void main(String args[]) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String with Regular Expresion(symbols) ::");
		String str=in.nextLine();
		System.out.println("Enter the Regular Expresion(symbols) ::");
		String k=in.nextLine();
		System.out.println("Enter the limit size ::");
		int lim=in.nextInt();
		String[] arrOfStr = str.split(k, lim); 
		System.out.println("String after split ::");
		for (String a : arrOfStr) 
			System.out.println(a); 
		in.close();
	} 
} 
