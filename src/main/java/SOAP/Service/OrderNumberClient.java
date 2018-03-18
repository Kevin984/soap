package SOAP.Service;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import SOAP.Service.OrderNumber;

public class OrderNumberClient{
	
	public static void main(String[] args) throws Exception {
	URL url = new URL("http://localhost:9999/ws/ordernumber?wsdl");
        //1st argument service URI, refer to wsdl document above
	//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://Service.SOAP/", "OrderNumberImplService");
        Service service = Service.create(url, qname);
        OrderNumber hello = service.getPort(OrderNumber.class);
        System.out.println(hello.getRandomOrdernumber("","","",34.34));
    }
}