package JSON_XML;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class xmlWrite {

	public static void main(String[] args) throws TransformerException, FileNotFoundException, ParserConfigurationException {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		
		Document document = documentBuilder.newDocument();
			
		Element element = document.createElement("Student");
		document.appendChild(element);
		
		Attr attr = document.createAttribute("ID");
		attr.setValue("1");
		element.setAttributeNode(attr);
	
		Element element1 = document.createElement("Name");
		element1.appendChild(document.createTextNode("karthik"));
		element.appendChild(element1);
		
		Element Surname = document.createElement("Surname");
		Surname.appendChild(document.createTextNode("mallya"));
		element.appendChild(Surname);
		
		Element Branch = document.createElement("Branch");
		Branch.appendChild(document.createTextNode("ES"));
		element.appendChild(Branch);
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(document);
		
		StreamResult streamResult = new StreamResult( new FileOutputStream("C:\\\\\\\\Users\\\\\\\\karthik\\\\\\\\eclipse-workspace\\\\\\\\assignments\\\\\\\\src\\\\\\\\JSON_XML\\\\\\\\kar.json"));
		
		transformer.transform(source,streamResult);
		System.out.println("Finished");
	}

}
