package SOAP.Service;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "SOAP.Service.OrderNumber")
public class OrderNumberImpl implements OrderNumber{
private String r ="0";
	 char digits[] = {'0','1','2','3','4','5','6','7','8','9'};

    public  char randomDecimalDigit() {
        return digits[(int)Math.floor(Math.random() * 10)];
    }

    public  String randomDecimalString(int ndigits) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<ndigits; i++) {
            result.append(randomDecimalDigit());
        }
        return result.toString();
    }


public String getRandomOrdernumber(String naam, String straat, String straatnummer, double bedrag) {
	try {
		TimeUnit.SECONDS.sleep(30);
		r = randomDecimalString(24);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	return r;
}


}