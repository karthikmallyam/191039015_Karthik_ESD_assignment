package assignments.array;
//4. Implement a JAVA program to find the transpose of 3x3 matrix. 
import java.util.Scanner;

public class transpose {
	static void transpose(int A[][], int B[][],int rows, int col) 
	{ 
		int i, j; 
		for (i = 0; i < rows; i++) 
			for (j = 0; j < col; j++) 
				B[i][j] = A[j][i]; 
	} 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Rows and Coloumns(both should be equal) of Array :");
		int rows=in.nextInt();
		int col=in.nextInt();
		int A[][] = new int[rows][col]; 
		int B[][] = new int[rows][col];
		int i,j;
		System.out.println("Enter the Elements to Array-1 :");
		 for (i = 0; i < rows; i++)
			 for (j = 0; j < col; j++)
				 A[i][j] = in.nextInt();
		transpose(A, B,rows,col); 
		System.out.print("Result matrix is \n"); 
		for (i = 0; i < rows; i++) 
		{ 
			for (j = 0; j < col; j++) 
			System.out.print(B[i][j] + " "); 
			System.out.print("\n"); 
		}
		in.close();
		} 
		
}
