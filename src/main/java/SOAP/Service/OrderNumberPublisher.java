package SOAP.Service;

import javax.xml.ws.Endpoint;
import SOAP.Service.OrderNumberImpl;

//Endpoint publisher
public class OrderNumberPublisher{
	
	public static void main(String[] args) {
		
		String port = System.getenv("PORT");
		String host = "http://0.0.0.0:";
		String uri = "/ws/ordernumber";
		
	   Endpoint.publish(host+port+uri, new OrderNumberImpl());
    }

}