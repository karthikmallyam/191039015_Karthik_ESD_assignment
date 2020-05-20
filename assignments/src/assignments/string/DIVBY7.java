package assignments.string;
//8.   Write a program to find the number of and sum of all integers greater than 100 and less than 200 that are divisible by 7 

public class DIVBY7 {
	public static int count=0,sum=0;

	public static void main(String[] args) {
		for(int i=100;i<=200;i++)
		{
			if((i%7)==0)
			{
				count++;
				sum=sum+i;
			}
		}
		System.out.println("Sum = "+sum+"and Count = "+count);
	}

}
