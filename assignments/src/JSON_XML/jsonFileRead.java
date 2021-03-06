package JSON_XML;

import java.io.FileReader; 
import java.util.Iterator; 
import java.util.Map; 

import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*; 

public class jsonFileRead 
{ 
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception 
	{ 
		Object obj = new JSONParser().parse(new FileReader("C:\\Users\\karthik\\eclipse-workspace\\assignments\\src\\JSON_XML\\kar.json")); 
		
		JSONObject jo = (JSONObject) obj; 
		String firstName = (String) jo.get("firstName"); 
		String lastName = (String) jo.get("lastName"); 
		
		System.out.println(firstName); 
		System.out.println(lastName);
		long age = (long) jo.get("age"); 
		System.out.println(age);
		Map address = ((Map)jo.get("address"));
		Iterator<Map.Entry> itr1 = address.entrySet().iterator(); 
		while (itr1.hasNext()) { 
			Map.Entry pair = itr1.next(); 
			System.out.println(pair.getKey() + " : " + pair.getValue()); 
		}
		JSONArray ja = (JSONArray) jo.get("phoneNumbers"); 
		Iterator itr2 = ja.iterator(); 
		
		while (itr2.hasNext()) 
		{ 
			itr1 = ((Map) itr2.next()).entrySet().iterator(); 
			while (itr1.hasNext()) { 
				Map.Entry pair = itr1.next(); 
				System.out.println(pair.getKey() + " : " + pair.getValue()); 
			} 
		} 
	} 
} 
