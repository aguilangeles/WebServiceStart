package example;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by mariaa on 05/08/15.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class HelloWorldService {
    @WebMethod(operationName = "sayHello")
   public String sayHello(@WebParam(name="guestname") String guestname){

        if(guestname==null){
            return "Hello";
        }
        return "Hello "+ guestname;

    }

}
