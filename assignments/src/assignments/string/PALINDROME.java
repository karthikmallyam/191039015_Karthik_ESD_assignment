package assignments.string;
//4.   Check whether entered string is a palindrome or not.
import java.util.Scanner;


public class PALINDROME {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String ::");
		String inputString =in.nextLine();
		String outputString=inputString;
		char tempArray1[] = inputString.toCharArray(); 
		char tempArray2[] = outputString.toCharArray();
		int j=(tempArray1.length)-1;
		boolean a=false;
		for(int i=0;i<j;i++)
		{
			if(tempArray1[i]!=tempArray2[j])
			{
				a=true;
				break;
			}
			j--;
		}
		if(a==false)
		{
			System.out.println("The Strings are polindrome");
		}
		else
		{
			System.out.println("The Strings are Not polindrome");
		}
		
		in.close();
	}

}
