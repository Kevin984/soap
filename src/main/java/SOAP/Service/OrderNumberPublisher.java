package SOAP.Service;

import javax.xml.ws.Endpoint;
import SOAP.Service.OrderNumberImpl;

//Endpoint publisher
public class OrderNumberPublisher{
	
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/ordernumber", new OrderNumberImpl());
    }

}