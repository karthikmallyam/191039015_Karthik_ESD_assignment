package assignments.array;
//1. Implement a JAVA program to find the minimum and maximum value of an array. 

import java.util.Arrays;
import java.util.Scanner;

public class minmax {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of Array :");
		int size=in.nextInt();
		int arr[] = new int[size]; 
		System.out.println("Enter the Elements to Array :");
		 for (int i = 0; i < size; i++)
			 arr[i] = in.nextInt();
		Arrays.sort(arr);
		System.out.println("Minimum = " + arr[0]);
		System.out.println("Maximum = " + arr[arr.length-1]);
		in.close();
	}
}