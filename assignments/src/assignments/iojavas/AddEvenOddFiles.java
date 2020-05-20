package assignments.iojavas;

//23. Read a file and redirect the odd and even lines into even.txt and odd.txt. 
import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner; 
import java.io.FileWriter; 
import java.io.IOException;

public class AddEvenOddFiles {
	static String s1;
	static boolean check =true;
public static void main(String[] args) throws IOException {
  try {
  	File myObj3 = new File("C:\\Users\\karthik\\eclipse-workspace\\assignments\\src\\assignments\\iojavas\\output files\\karthik.txt");
		Scanner myReader3 = new Scanner(myObj3);
		File myObj4 = new File("C:\\Users\\karthik\\eclipse-workspace\\assignments\\src\\assignments\\iojavas\\output files\\karthik.txt");
		Scanner myReader4 = new Scanner(myObj4);
		while (myReader3.hasNextLine()  || myReader4.hasNextLine() )
			{
		    	String data1 = myReader3.nextLine();
		    	String data2 = myReader4.nextLine();
		    	s1=s1+"\n"+data1;
		    	s1=s1+"\n"+data2;
		    }
		s1=s1.replace("null", "");
		System.out.println(s1);
		FileWriter myWriter = new FileWriter("C:\\Users\\karthik\\eclipse-workspace\\assignments\\src\\assignments\\iojavas\\output files\\added_even_odd.txt");
		myWriter.write(s1);
		myWriter.close();
		System.out.println("Successfully copied even and odd file to single file");
		myReader3.close();
		myReader4.close();
  	}catch (FileNotFoundException e) {
  		System.out.println("An error occurred.");
  		e.printStackTrace();
  	}	
}
}