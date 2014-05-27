package br.udesc.servicos.entity;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-05-24T10:30:29.707-03:00
 * Generated source version: 2.7.10
 * 
 */
@WebServiceClient(name = "PedidoService", 
                  wsdlLocation = "http://localhost:8080/UDESCSoftServicosSOA/services/PedidoServicePort?wsdl",
                  targetNamespace = "http://entity.servicos.udesc.br/") 
public class PedidoService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://entity.servicos.udesc.br/", "PedidoService");
    public final static QName PedidoServicePort = new QName("http://entity.servicos.udesc.br/", "PedidoServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/UDESCSoftServicosSOA/services/PedidoServicePort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PedidoService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/UDESCSoftServicosSOA/services/PedidoServicePort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PedidoService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PedidoService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PedidoService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PedidoService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PedidoService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PedidoService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns PedidoService
     */
    @WebEndpoint(name = "PedidoServicePort")
    public PedidoService getPedidoServicePort() {
        return super.getPort(PedidoServicePort, PedidoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PedidoService
     */
    @WebEndpoint(name = "PedidoServicePort")
    public PedidoService getPedidoServicePort(WebServiceFeature... features) {
        return super.getPort(PedidoServicePort, PedidoService.class, features);
    }

}
