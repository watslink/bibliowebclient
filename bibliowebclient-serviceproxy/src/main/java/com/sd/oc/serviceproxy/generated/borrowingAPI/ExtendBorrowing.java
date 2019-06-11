
package com.sd.oc.serviceproxy.generated.borrowingAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour extendBorrowing complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="extendBorrowing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="borrowing_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extendBorrowing", propOrder = {
    "borrowingId"
})
public class ExtendBorrowing {

    @XmlElement(name = "borrowing_id")
    protected int borrowingId;

    /**
     * Obtient la valeur de la propriété borrowingId.
     * 
     */
    public int getBorrowingId() {
        return borrowingId;
    }

    /**
     * Définit la valeur de la propriété borrowingId.
     * 
     */
    public void setBorrowingId(int value) {
        this.borrowingId = value;
    }

}
