//7.       Implement a JAVA program to find area of a) triangle b) circle [ use case statement] 

package assignments.simpleprg;
import java.util.Scanner;


public class areaof {
	static Scanner in = new Scanner(System.in);
	static double circle()
	{
		System.out.println("Enter the Radius of the circle ::");
		double radius = in.nextDouble();
		return(Math.PI*radius*radius);
	}
	static double triangle()
	{
		System.out.println("Enter the base and height of the triangle ::");
		double base = in.nextDouble();
		double height = in.nextDouble();
		return(0.5*base*height);
	}
	public static void main(String[] args) {
		boolean con=true;
		while(con)
			{
			System.out.println("Enter 1->Area of CIRCLE,2->Area of TRIANGLE and 3->Exit ::");
			System.out.println("Enter the value of x ::");
			int x = in.nextInt();
			switch(x) 
			{
			case 1:
				double area_circle = circle();
				System.out.println("Area of circle is = "+area_circle);
				break;
			case 2:
				double area_triangle=triangle();
				System.out.println("Area of triangle is = "+area_triangle);
				break;
			case 3:
				con=false;
			}
			}
		in.close();
	}
}
