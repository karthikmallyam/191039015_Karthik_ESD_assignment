
package JSON_XML;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class xmlRead {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		File xmlFile = new File("C:\\\\\\\\Users\\\\\\\\karthik\\\\\\\\eclipse-workspace\\\\\\\\assignments\\\\\\\\src\\\\\\\\JSON_XML\\\\\\\\kar.json");
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.parse(xmlFile);
		
		NodeList list = document.getElementsByTagName("Student");
		
		for(int i = 0; i < list.getLength(); i++)
		{
			Node node = list.item(i);
			if(node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				
				System.out.println("ID :  " + element.getAttribute("ID"));
				System.out.println("Name :  " + element.getElementsByTagName("Name").item(0).getTextContent());
				System.out.println("Surname :  " + element.getElementsByTagName("Surname").item(0).getTextContent());
				System.out.println("Branch :  " + element.getElementsByTagName("Branch").item(0).getTextContent());
			}
		}
	}

}
