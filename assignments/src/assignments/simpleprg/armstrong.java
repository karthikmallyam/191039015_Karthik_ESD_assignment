//9.      Implement a JAVA program to find the Armstrong number

package assignments.simpleprg;
import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int  num = in.nextInt();
		int num1=num;
		int len;
		double sum=0,rem;
		for(len=0;num!=0;len++)
		{
			num=num/10;
		}
		num=num1;
		for(int i=len;i>0;i--)
		{
			rem=num%10;
			sum=sum+Math.pow(rem,len);
			num=num/10;
		}
		if(sum==num1)
		{
			System.out.println("The "+num1+" is a Armstrong Number");
		}
		else
		{
			System.out.println("The "+num1+" is Not a Armstrong Number");
		}
		in.close();
	}

}
