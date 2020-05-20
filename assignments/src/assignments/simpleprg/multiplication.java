package assignments.simpleprg;
//11. Print a multiplication table for given n is the number and lim is the number of limit 
import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number of which tables to Display and limit ::");
		int n = in.nextInt();
		int lim = in.nextInt();
		for (int i = 1; i <= lim; ++i)
			System.out.println(n + " * " + i + " = " + n * i); 
		in.close();
		}
}
