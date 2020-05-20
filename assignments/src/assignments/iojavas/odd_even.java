package assignments.iojavas;
//23. Read a file and redirect the odd and even lines into even.txt and odd.txt. 
import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner; 
import java.io.FileWriter; 
import java.io.IOException;

public class odd_even {
	static String s1="none",s2="none";
public static void main(String[] args) throws IOException {
  try {
    File myObj = new File("C:\\Users\\karthik\\eclipse-workspace\\assignments\\src\\assignments\\iojavas\\output files\\karthik.txt");
    Scanner myReader = new Scanner(myObj);
    int len =0;
    while (myReader.hasNextLine()) {
  	  len++;
  	  if(len%2 == 0)
  	  {
  		  String data = myReader.nextLine();
  		  if(s1 == "none")
  		  {
  			  s1=data;
  		  }
  		  else
  		  {
  			  s1=s1+"\n"+data;
  		  }
  	        System.out.println(data);
  	  }
  	  else
  	  {
  		  String data = myReader.nextLine();
  		  if(s2 == "none")
  		  {
  			  s2=data;
  		  }
  		  else
  		  {
  			  s2=s2+"\n"+data;
  		  }
  	        System.out.println(data);
  	  }
  	  
    }
    System.out.println(s1);
	  System.out.println(s2);
	  FileWriter myWriter = new FileWriter("C:\\Users\\karthik\\eclipse-workspace\\assignments\\src\\assignments\\iojavas\\output files\\kar_even.txt");
    myWriter.write(s1);
    myWriter.close();
    System.out.println("Successfully copied even lines to even file");
    myReader.close();
    FileWriter myWriter1 = new FileWriter("C:\\Users\\karthik\\eclipse-workspace\\assignments\\src\\assignments\\iojavas\\output files\\kar_odd.txt");
    myWriter1.write(s2);
    myWriter1.close();
    System.out.println("Successfully copied odd lines to even file");
    myReader.close();
  } catch (FileNotFoundException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
  }
}
}