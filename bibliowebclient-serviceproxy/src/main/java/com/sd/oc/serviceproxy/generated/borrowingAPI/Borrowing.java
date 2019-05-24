
package com.sd.oc.serviceproxy.generated.borrowingAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour borrowing complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="borrowing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="book" type="{http://API.oc.sd.com/}book" minOccurs="0"/>
 *         &lt;element name="borrowing_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="extended" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="returnDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user" type="{http://API.oc.sd.com/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "borrowing", propOrder = {
    "book",
    "borrowingId",
    "extended",
    "returnDate",
    "user"
})
public class Borrowing {

    protected Book book;
    @XmlElement(name = "borrowing_id")
    protected int borrowingId;
    protected boolean extended;
    protected String returnDate;
    protected User user;

    /**
     * Obtient la valeur de la propri�t� book.
     * 
     * @return
     *     possible object is
     *     {@link Book }
     *     
     */
    public Book getBook() {
        return book;
    }

    /**
     * D�finit la valeur de la propri�t� book.
     * 
     * @param value
     *     allowed object is
     *     {@link Book }
     *     
     */
    public void setBook(Book value) {
        this.book = value;
    }

    /**
     * Obtient la valeur de la propri�t� borrowingId.
     * 
     */
    public int getBorrowingId() {
        return borrowingId;
    }

    /**
     * D�finit la valeur de la propri�t� borrowingId.
     * 
     */
    public void setBorrowingId(int value) {
        this.borrowingId = value;
    }

    /**
     * Obtient la valeur de la propri�t� extended.
     * 
     */
    public boolean isExtended() {
        return extended;
    }

    /**
     * D�finit la valeur de la propri�t� extended.
     * 
     */
    public void setExtended(boolean value) {
        this.extended = value;
    }

    /**
     * Obtient la valeur de la propri�t� returnDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * D�finit la valeur de la propri�t� returnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDate(String value) {
        this.returnDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� user.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * D�finit la valeur de la propri�t� user.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

}
