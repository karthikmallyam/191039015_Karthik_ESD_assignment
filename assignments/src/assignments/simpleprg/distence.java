//6.       Implement a JAVA program to find the distance of two points (x1,y1) and (x2,y2). 
package assignments.simpleprg;
import java.util.Scanner;
public class distence {
	

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the value of x1,y1 :");
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			System.out.println("Enter the value of x2,y2 :");
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
			System.out.println("distance is"+dis);
			in.close();
		}


}
