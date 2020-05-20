package assignments.string;
//10.                Given a number,write a program using while loop reverse the digits of the number 
import java.util.Scanner;

public class reverseno {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number ::");
		int  num = in.nextInt();
		int num1=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		System.out.println("The reversed num of "+num1+" is "+sum);
		in.close();
	}

}
