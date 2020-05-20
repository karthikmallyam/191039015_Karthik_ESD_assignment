//4.       Implement a JAVA program for finding  X.         

package assignments.simpleprg;
import java.util.Scanner;


public class findx {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		double a = data.nextDouble();
		System.out.println("Enter the value of b :");
		double b = data.nextDouble();
		System.out.println("Enter the value of c :");
		double c = data.nextDouble();
		double determinant = (b*b)-(4*a*c);
		double sqrt = Math.sqrt(determinant);
		System.out.println(determinant);
		if(determinant > 0)
		{
			double firstRoot = (-b + sqrt)/(2*a);
			double secondRoot = (-b - sqrt)/(2*a);
			System.out.println("Roots are :: "+ firstRoot +" and "+secondRoot);
		}
		else if(determinant <= 0)
		{
			System.out.println("Root is : "+(-b + sqrt)/(2*a));
		}
		data.close();
	}
}
