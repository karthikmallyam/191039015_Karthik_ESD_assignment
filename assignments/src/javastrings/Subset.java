package javastrings;

//4. Java Program to Find All Possible Subsets of given Length in String 
import java.util.Scanner;

public class Subset {
	
	static void subset(String A, int k, int start, int currLen, boolean[] used,int len) 
	{

		if (currLen == k) 
		{
			for (int i = 0; i < len; i++)
			{
				if (used[i] == true) 
				{
					System.out.print(A.charAt(i) + " ");
				}
			}
			System.out.println();
			return;
		}
		if (start == len)
		{
			return;
		}
		used[start] = true;
		subset(A, k, start + 1, currLen + 1, used, len);
		used[start] = false;
		subset(A, k, start + 1, currLen, used,len);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String ::");
		String str=in.nextLine();
		int len = str.length();
		System.out.println("string :: "+str);
		System.out.println("Enter the Subset lenght size ::");
		int k=in.nextInt();
		boolean[] B = new boolean[len];
		subset(str, k, 0, 0, B,len);
		in.close();
	}

}