package assignments.array;
//2. Implement a JAVA program to add two matrix A and B. (simple 2x2 matrix)
import java.util.Scanner;

public class addmatrix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Rows and Coloumns of Array's :");
		int rows=in.nextInt();
		int col=in.nextInt();
		int arr1[][] = new int[rows][col]; 
		int arr2[][] = new int[rows][col]; 
		int arr3[][] = new int[rows][col]; 
		int i,j;
		System.out.println("Enter the Elements to Array-1 :");
		 for (i = 0; i < rows; i++)
			 for (j = 0; j < col; j++)
				 arr1[i][j] = in.nextInt();
		 System.out.println("Enter the Elements to Array-2 :");
		 for (i = 0; i < rows; i++)
			 for (j = 0; j < col; j++)
				 arr2[i][j] = in.nextInt();
		 //addition
		 for (i = 0; i < rows; i++)
			 for (j = 0; j < col; j++)
				 arr3[i][j] = arr1[i][j] + arr2[i][j];
		 System.out.println("The sum of Array :");
		 for (i = 0; i < rows; i++)
			 for (j = 0; j < col; j++)
			 {
				 System.out.print(arr3[i][j]+" ");
				 System.out.print("\n");
			 }
		 in.close();
	}
}