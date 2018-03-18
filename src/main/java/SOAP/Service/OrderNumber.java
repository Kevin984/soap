package SOAP.Service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface OrderNumber{
 
	@WebMethod String getRandomOrdernumber(String naam, String straat, String straatnummer, double bedrag);

}