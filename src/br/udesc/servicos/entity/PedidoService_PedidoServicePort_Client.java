
package br.udesc.servicos.entity;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-05-24T10:30:29.501-03:00
 * Generated source version: 2.7.10
 * 
 */
public final class PedidoService_PedidoServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://entity.servicos.udesc.br/", "PedidoService");

    private PedidoService_PedidoServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = PedidoService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        PedidoService_Service ss = new PedidoService_Service(wsdlURL, SERVICE_NAME);
        PedidoService port = ss.getPedidoServicePort();  
        
        {
        System.out.println("Invoking alterarStatusPedido...");
        int _alterarStatusPedido_codPedido = 1183612890;
        int _alterarStatusPedido_novoStatus = 615490737;
        port.alterarStatusPedido(_alterarStatusPedido_codPedido, _alterarStatusPedido_novoStatus);


        }
        {
        System.out.println("Invoking getPedido...");
        int _getPedido_codPedido = -819281563;
        br.udesc.servicos.entity.Pedido _getPedido__return = port.getPedido(_getPedido_codPedido);
        System.out.println("getPedido.result=" + _getPedido__return);


        }
        {
        System.out.println("Invoking createPedido...");
        br.udesc.servicos.entity.Pedido _createPedido_pedido = new br.udesc.servicos.entity.Pedido();
        _createPedido_pedido.setCliente("Cliente-1706738485");
        _createPedido_pedido.setCodigo(1908399524);
        _createPedido_pedido.setDataCadastro(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2014-05-24T10:30:29.632-03:00"));
        _createPedido_pedido.setDataEntrega(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2014-05-24T10:30:29.636-03:00"));
        java.util.List<br.udesc.servicos.entity.ItemPedido> _createPedido_pedidoItens = new java.util.ArrayList<br.udesc.servicos.entity.ItemPedido>();
        br.udesc.servicos.entity.ItemPedido _createPedido_pedidoItensVal1 = new br.udesc.servicos.entity.ItemPedido();
        br.udesc.servicos.entity.Produto _createPedido_pedidoItensVal1Produto = new br.udesc.servicos.entity.Produto();
        _createPedido_pedidoItensVal1Produto.setCodigo(1437581490);
        _createPedido_pedidoItensVal1Produto.setDescricao("Descricao719113472");
        _createPedido_pedidoItensVal1Produto.setQuantidadeEstoque(-269788738);
        _createPedido_pedidoItensVal1Produto.setValorUnitario(0.6380686130297825);
        _createPedido_pedidoItensVal1.setProduto(_createPedido_pedidoItensVal1Produto);
        _createPedido_pedidoItensVal1.setQuantidade(-944813462);
        _createPedido_pedidoItensVal1.setValorUnitario(0.18704844655103037);
        _createPedido_pedidoItens.add(_createPedido_pedidoItensVal1);
        _createPedido_pedido.getItens().addAll(_createPedido_pedidoItens);
        _createPedido_pedido.setStatus(1222810629);
        boolean _createPedido__return = port.createPedido(_createPedido_pedido);
        System.out.println("createPedido.result=" + _createPedido__return);


        }
        {
        System.out.println("Invoking getPedidosPorStatus...");
        int _getPedidosPorStatus_codStatus = -1477634903;
        java.util.List<br.udesc.servicos.entity.Pedido> _getPedidosPorStatus__return = port.getPedidosPorStatus(_getPedidosPorStatus_codStatus);
        System.out.println("getPedidosPorStatus.result=" + _getPedidosPorStatus__return);


        }

        System.exit(0);
    }

}
