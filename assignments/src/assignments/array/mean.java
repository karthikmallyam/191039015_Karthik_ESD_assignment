package assignments.array;

//5. Implement a JAVA program to find the mean of an “n” size array. 
import java.util.Scanner;


public class mean {
	public static double findMean(int a[], int n) 
	{ 
		int sum = 0; 
		for (int i = 0; i < n; i++) 
			sum += a[i]; 
	
		return (double)sum / (double)n; 
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of Array :");
		int size=in.nextInt();
		int arr[] = new int[size]; 
		System.out.println("Enter the Elements to Array :");
		 for (int i = 0; i < size; i++)
			 arr[i] = in.nextInt();
		 
		System.out.println("Mean = " + findMean(arr, size)); 
		in.close();

	}

}
