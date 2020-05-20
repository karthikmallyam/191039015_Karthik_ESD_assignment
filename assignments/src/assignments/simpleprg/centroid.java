//5.       Implement a JAVA program to find a centroid of a triangle. 

package assignments.simpleprg;
import java.util.Scanner;

public class centroid {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of x1,y1 :");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		System.out.println("Enter the value of x2,y2 :");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		System.out.println("Enter the value of x3,y3 :");
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();
		double cx1 = (x1+x2+x3)/3;
		double cy1 = (y1+y2+y3)/3;
		System.out.println("Centroid(G) (X1,Y1) = ("+cx1+","+cy1+")");
		in.close();
		}
	}