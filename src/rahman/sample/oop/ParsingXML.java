package rahman.sample.oop;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParsingXML {

	public static void main(String[] args) {
		parsingXml();
	}
	
	public static String parsingXml(){
		String config = null;
		try {
			File file = new File("xml/source.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize();
			
			System.out.println("Root element : "+doc.getDocumentElement().getNodeName());
			
			NodeList nodes = doc.getElementsByTagName("stock");
			
			for(int i=0; i<nodes.getLength(); i++){
				Node node = nodes.item(i);
				
				if(node.getNodeType() == Node.ELEMENT_NODE){
					Element element = (Element)node;
					System.out.println("Symbol: "+getValue("symbol", element));
					System.out.println("Harga: "+getValue("price", element));
					System.out.println("Quantity: "+getValue("quantity", element));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return config;
	}
	
	private static String getValue(String tag, Element element){
		NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = nodes.item(0);
		return node.getNodeValue();
	}

}
