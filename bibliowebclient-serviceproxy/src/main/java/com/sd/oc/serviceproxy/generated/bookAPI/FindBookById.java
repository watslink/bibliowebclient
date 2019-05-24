
package com.sd.oc.serviceproxy.generated.bookAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour findBookById complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="findBookById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="book_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findBookById", propOrder = {
    "bookId"
})
public class FindBookById {

    @XmlElement(name = "book_id")
    protected int bookId;

    /**
     * Obtient la valeur de la propri�t� bookId.
     * 
     */
    public int getBookId() {
        return bookId;
    }

    /**
     * D�finit la valeur de la propri�t� bookId.
     * 
     */
    public void setBookId(int value) {
        this.bookId = value;
    }

}
