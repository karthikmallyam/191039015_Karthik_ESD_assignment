package assignments.string;
//14.Generate 10 random numbers and display them. 
import java.util.Random;
import java.util.Scanner;

public class random10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of Numbers ::");
		int len = in.nextInt();
		Random rand = new Random(); 
		System.out.println("Random Numbers between (0-100) are ::");
		for(int i=0;i<len;i++)
		{
			System.out.println(rand.nextInt(100));
		}
		in.close();
	}
}