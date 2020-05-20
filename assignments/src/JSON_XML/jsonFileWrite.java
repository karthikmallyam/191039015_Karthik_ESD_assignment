package JSON_XML;

import java.io.FileNotFoundException; 
import java.io.PrintWriter; 
import java.util.LinkedHashMap; 
import java.util.Map; 
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 

public class jsonFileWrite 
{ 
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws FileNotFoundException 
	{ 
		JSONObject jo = new JSONObject(); 
		
		jo.put("firstName", "John"); 
		jo.put("lastName", "Smith"); 
		jo.put("age", 25); 
		
		Map m = new LinkedHashMap(4); 
		m.put("streetAddress", "21 2nd Street"); 
		m.put("city", "New York"); 
		m.put("state", "NY"); 
		m.put("postalCode", 10021); 
		
		jo.put("address", m); 
		
		JSONArray ja = new JSONArray(); 
		
		m = new LinkedHashMap(2); 
		m.put("type", "home"); 
		m.put("number", "212 555-1234"); 
		
		ja.add(m); 
		
		m = new LinkedHashMap(2); 
		m.put("type", "fax"); 
		m.put("number", "212 555-1234"); 
		
		ja.add(m); 
		
		jo.put("phoneNumbers", ja); 
		
		PrintWriter pw = new PrintWriter("C:\\\\Users\\\\karthik\\\\eclipse-workspace\\\\assignments\\\\src\\\\JSON_XML\\\\kar.json"); 
		pw.write(jo.toJSONString()); 
		
		pw.flush(); 
		pw.close(); 
		System.out.println("Finished");
	} 
} 
