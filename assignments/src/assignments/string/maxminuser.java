package assignments.string;
//13. Allow the user to enter 10 numbers. Find max, min and sort the input. 
import java.util.Arrays;
import java.util.Scanner;


public class maxminuser {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of Numbers ::");
		int size=in.nextInt();
		int arr[] = new int[size]; 
		System.out.println("Enter the Numbers ::");
		 for (int i = 0; i < size; i++)
			 arr[i] = in.nextInt();
		Arrays.sort(arr);
		System.out.println("Minimum = " + arr[0]);
		System.out.println("Maximum = " + arr[arr.length-1]);
		System.out.println("Sorted Numbers ::");
		for (int i = 0; i < size; i++)
			System.out.print(arr[i]+"\t");
		in.close();
	}

}
