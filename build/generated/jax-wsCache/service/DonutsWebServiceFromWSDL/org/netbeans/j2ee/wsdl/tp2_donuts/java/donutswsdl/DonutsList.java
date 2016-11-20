
package org.netbeans.j2ee.wsdl.tp2_donuts.java.donutswsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DonutsList complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DonutsList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="donut" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DonutsList", propOrder = {
    "donut"
})
public class DonutsList {

    @XmlElement(required = true)
    protected String donut;

    /**
     * Obtient la valeur de la propriété donut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonut() {
        return donut;
    }

    /**
     * Définit la valeur de la propriété donut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonut(String value) {
        this.donut = value;
    }

}
