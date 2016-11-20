/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donutsWebServiceFromWSDL;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import org.netbeans.j2ee.wsdl.tp2_donuts.java.donutswsdl.DonutsList;

/**
 *
 * @author WWW
 */
@WebService(serviceName = "DonutsWSDLService", portName = "DonutsWSDLPort", endpointInterface = "org.netbeans.j2ee.wsdl.tp2_donuts.java.donutswsdl.DonutsWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/TP2_Donuts/java/DonutsWSDL", wsdlLocation = "WEB-INF/wsdl/DonutsWebServiceFromWSDL/DonutsWSDL.wsdl")
public class DonutsWebServiceFromWSDL {
    
    private List<String> allDonuts = new ArrayList<>();

    public boolean deposerUnDonut(java.lang.String topping) {
        return allDonuts.add(topping);
    }

    public int nombreDonutsDisponibles() {
        return allDonuts.size();
    }

    public org.netbeans.j2ee.wsdl.tp2_donuts.java.donutswsdl.DonutsList recevoirDonuts(int nombre) {
        DonutsList list = new DonutsList();
        
        if(nombre>allDonuts.size()){
            list.setDonut(allDonuts);
        }else{
            for(int i=0;i<nombre;i++){
                list.getDonut().add(allDonuts.get(i));
            }
        }
        
        return list;
    }
    
}
