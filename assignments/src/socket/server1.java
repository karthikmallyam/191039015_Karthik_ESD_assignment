package socket;
//27. Send a value and get the square and square root of the number from the server. 28

//server1
import java.io.*;
import java.net.*;

public class server1 {

public static void main(String[] args) throws Exception
{
    try (ServerSocket sersock = new ServerSocket(3000)) {
		System.out.println("Server  ready to recieve");
		  Socket sock = sersock.accept( );                          
		                  
		  OutputStream ostream = sock.getOutputStream(); 
		  PrintWriter pwrite = new PrintWriter(ostream, true);

		  InputStream istream = sock.getInputStream();
		  BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));

		  String receiveMessage, sendMessage;               
		  while(true)
		  { 
		    if((receiveMessage = receiveRead.readLine()) != null)  
		    {
		       System.out.println(receiveMessage);         
		    }         
		    double a = Double.parseDouble(receiveMessage);
			double square=Math.pow(a, 2);
			double sqroot=Math.sqrt(a);
			String s1=Double.toString(square);
			String s2=Double.toString(sqroot);
			sendMessage="square of "+a+" is "+s1+" and square root of "+a+" is "+s2;
		    pwrite.println(sendMessage);             
		    pwrite.flush();
		  }
	}               
  }                    
}                        