package assignments.iojavas;
//24. Create a multiplication table of file as 1.txt, 2.txt….10.txt with corresponding tables till 10.
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class MulFile {

	public static void main(String[] args) throws IOException {
		String mul_line;
		Scanner in = new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			String file_name=Integer.toString(i)+".txt";
			file_name="C:\\\\Users\\\\karthik\\\\eclipse-workspace\\\\assignments\\\\src\\\\assignments\\\\iojavas\\\\output files\\\\"+file_name;
			String s_final="";
			for (int j = 1; j <= 10; j++)
			{
				mul_line=Integer.toString(i)+ " * " + Integer.toString(j) + " = " + Integer.toString(i*j);
				s_final=s_final+mul_line+"\n";
				FileWriter myWriter = new FileWriter(file_name);
			      myWriter.write(s_final);
			      myWriter.close();
			}
		}
		System.out.println("Finished");
		in.close();
	}

}
