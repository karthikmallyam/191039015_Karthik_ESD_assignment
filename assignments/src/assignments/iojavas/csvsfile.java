package assignments.iojavas;

//22. Create a CSV file with SNo, MOVIENAME, DIRECTOR with 5 records. Also read the csv file and display. 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class csvsfile extends csvReader {
public static void main(String[] args) throws FileNotFoundException {
//	 create and write csv file
	 Scanner in = new Scanner(System.in);
 PrintWriter pw= new PrintWriter(new File("C:\\Users\\karthik\\eclipse-workspace\\assignments\\src\\assignments\\iojavas\\csvExample.csv"));
 StringBuilder sb=new StringBuilder();
 System.out.println("Enter the number of Record ::");
 int l=in.nextInt();
 sb.append("SL_NO,MOVIENAME,DIRECTOR\r\n");
 in.nextLine();
 for(int i=0;i<l;i++)
 {
	   System.out.println("Enter the SL_NO ::");
	   String str1=in.nextLine();
	   System.out.println("Enter the MOVIENAME ::");
	   String str2=in.nextLine();
	   System.out.println("Enter the DIRECTOR  ::");
	   String str3=in.nextLine();
	   sb.append(str1+","+str2+","+str3+"\r\n");
 }
 pw.write(sb.toString());
 pw.close();
 System.out.println("finished");
in.close();
}
}
