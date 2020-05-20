//10.     Implement a JAVA program to find the distance using Pythagoras theorem.

package assignments.simpleprg;
import java.util.Scanner;

public class pythagoras {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of Base(a) and Perpendicular(b) length ::");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = (a*a) + (b*b);
		c = Math.sqrt(c);
		System.out.println("The length of Hypotenuse(c) is :"+c);
		in.close();
	}

}
