package SOAP.Service;

import javax.xml.ws.Endpoint;
import SOAP.Service.OrderNumberImpl;

//Endpoint publisher
public class OrderNumberPublisher{
	
	public static void main(String[] args) {
	   Endpoint.publish("https://webshopsoap.herokuapp.com/ws/ordernumber", new OrderNumberImpl());
    }

}