
package com.sd.oc.proxies.generated.borrowingAPI;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour book complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="book">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="book_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbStock" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="publishYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "book", propOrder = {
    "author",
    "bookId",
    "nbPages",
    "nbStock",
    "publishYear",
    "title"
})
public class Book {

    protected String author;
    @XmlElement(name = "book_id")
    protected int bookId;
    protected int nbPages;
    protected int nbStock;
    protected int publishYear;
    protected String title;

    /**
     * Obtient la valeur de la propriété author.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Définit la valeur de la propriété author.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Obtient la valeur de la propriété bookId.
     * 
     */
    public int getBookId() {
        return bookId;
    }

    /**
     * Définit la valeur de la propriété bookId.
     * 
     */
    public void setBookId(int value) {
        this.bookId = value;
    }

    /**
     * Obtient la valeur de la propriété nbPages.
     * 
     */
    public int getNbPages() {
        return nbPages;
    }

    /**
     * Définit la valeur de la propriété nbPages.
     * 
     */
    public void setNbPages(int value) {
        this.nbPages = value;
    }

    /**
     * Obtient la valeur de la propriété nbStock.
     * 
     */
    public int getNbStock() {
        return nbStock;
    }

    /**
     * Définit la valeur de la propriété nbStock.
     * 
     */
    public void setNbStock(int value) {
        this.nbStock = value;
    }

    /**
     * Obtient la valeur de la propriété publishYear.
     * 
     */
    public int getPublishYear() {
        return publishYear;
    }

    /**
     * Définit la valeur de la propriété publishYear.
     * 
     */
    public void setPublishYear(int value) {
        this.publishYear = value;
    }

    /**
     * Obtient la valeur de la propriété title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Définit la valeur de la propriété title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
