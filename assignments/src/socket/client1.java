package socket;
//27. Send a value and get the square and square root of the number from the server. 28

//client1
import java.io.*;
import java.net.*;

public class client1 {
public static void main(String[] args) throws Exception
{
   try (Socket sock = new Socket("127.0.0.1", 3000)) {
  BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
  OutputStream ostream = sock.getOutputStream(); 
  PrintWriter pwrite = new PrintWriter(ostream, true);

  InputStream istream = sock.getInputStream();
  BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));

  System.out.println("Enter the number ::");

  String receiveMessage, sendMessage;               
  while(true)
  {
    sendMessage = keyRead.readLine();  
    pwrite.println(sendMessage);       
    pwrite.flush();                    
    if((receiveMessage = receiveRead.readLine()) != null) 
    {
       System.out.println(receiveMessage); 
    }
   }
	}  
   
  }                    
}                        