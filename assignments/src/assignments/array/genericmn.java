package assignments.array;
//3. Extend the above problem for generic m x n matrix.
import java.util.Scanner;

public class genericmn {


public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the Rows and Coloumns of Array 1 ::");
	int rows1=in.nextInt();
	int col1=in.nextInt();
	System.out.println("Enter the Rows and Coloumns of Array 2 ::");
	int rows2=in.nextInt();
	int col2=in.nextInt();
	int arr1[][] = new int[rows1][col1]; 
	int arr2[][] = new int[rows2][col2]; 
	int arr3[][] = new int[rows1][col1]; 
	int i,j;
	if(rows1==rows2 && col1==col2)
	{
		System.out.println("Enter the Elements to Array-1 ::");
		for (i = 0; i < rows1; i++)
			for (j = 0; j < col1; j++)
				arr1[i][j] = in.nextInt();
		System.out.println("Enter the Elements to Array-2 ::");
		for (i = 0; i < rows2; i++)
			for (j = 0; j < col2; j++)
				arr2[i][j] = in.nextInt();
		 //addition
		 for (i = 0; i < rows1; i++)
			 for (j = 0; j < col1; j++)
				 arr3[i][j] = arr1[i][j] + arr2[i][j];
		 System.out.println("The sum of Array ::");
		 for (i = 0; i < rows1; i++)
			 for (j = 0; j < col1; j++)
				 {
				 	System.out.print(arr3[i][j]+" ");
				 	System.out.print("\n");
				 }
				 
	}
	else
	{
		System.out.println("Rows and Coloumns of both matrix's are not Equal");
	}
	in.close();
}
}