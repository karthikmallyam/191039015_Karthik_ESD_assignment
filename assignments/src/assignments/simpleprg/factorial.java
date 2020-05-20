//8.       Implement a JAVA program to find a factorial of a number. 
package assignments.simpleprg;
import java.util.Scanner;


public class factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number ::");
		int  num = in.nextInt();
		int res=1;
		for(int i=num;i>0;i--)
		{
			res=res*i;
		}
		System.out.println("Factorial of the Number is :" +res);
		in.close();
	}

}
