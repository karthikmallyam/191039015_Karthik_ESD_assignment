package assignments.string;
//5.   Write a program to convert the given temperature in fahrenheit to celsius using the following conversion formula C=(F-32)/1.8 
import java.util.Scanner;

public class FARTOTEMP {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Temperature in Fahrenheit ::");
		double tempF=in.nextDouble();
		double tempC=(tempF-32)/1.8;
		System.out.println("Temperature in Celcius :: "+tempC+" degree celcius");
		in.close();
	}

}
