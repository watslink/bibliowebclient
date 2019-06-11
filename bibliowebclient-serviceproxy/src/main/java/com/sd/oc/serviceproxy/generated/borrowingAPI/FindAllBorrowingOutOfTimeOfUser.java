
package com.sd.oc.serviceproxy.generated.borrowingAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour findAllBorrowingOutOfTimeOfUser complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="findAllBorrowingOutOfTimeOfUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findAllBorrowingOutOfTimeOfUser", propOrder = {
    "userId"
})
public class FindAllBorrowingOutOfTimeOfUser {

    @XmlElement(name = "user_id")
    protected int userId;

    /**
     * Obtient la valeur de la propriété userId.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Définit la valeur de la propriété userId.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

}
