package assignments.string;
//6.   Write a Program to sort an array of Numbers 
import java.util.Arrays;
import java.util.Scanner;


public class SORTARRAY {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of Array ::");
		int size=in.nextInt();
		int arr[] = new int[size]; 
		System.out.println("Enter the Elements to Array ::");
		 for (int i = 0; i < size; i++)
			 arr[i] = in.nextInt();
		Arrays.sort(arr);
		System.out.println("Sorted array is :: ");
		for (int i = 0; i < size; i++)
			System.out.print(arr[i]+" ");
		in.close();
	}

}
