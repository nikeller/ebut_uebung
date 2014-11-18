
package de.htwg_konstanz.ebus.wholesaler.ws.order;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0_01-b59-fcs
 * Generated source version: 2.0
 * 
 */
@WebService(name = "OrderServicePortType", targetNamespace = "http://www.htwg-konstanz.de/ebsf/ws/order")
@SOAPBinding(parameterStyle = ParameterStyle.BARE)
public interface OrderServicePortType {


    /**
     * 
     * @param request
     * @return
     *     returns de.htwg_konstanz.ebus.wholesaler.ws.order.OrderServiceResponse
     * @throws OrderServiceFault
     */
    @WebMethod
    @WebResult(name = "OrderServiceResponse", targetNamespace = "http://www.htwg-konstanz.de/ebsf/ws/order", partName = "response")
    public OrderServiceResponse purchaseOrder(
        @WebParam(name = "OrderServiceRequest", targetNamespace = "http://www.htwg-konstanz.de/ebsf/ws/order", partName = "request")
        OrderServiceRequest request)
        throws OrderServiceFault
    ;

}
