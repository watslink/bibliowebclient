
package com.sd.oc.proxies.generated.bookAPI;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sd.oc.proxies.generated.bookAPI package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindBookById_QNAME = new QName("http://API.oc.sd.com/", "findBookById");
    private final static QName _FindAllBooksResponse_QNAME = new QName("http://API.oc.sd.com/", "findAllBooksResponse");
    private final static QName _FindAllBooks_QNAME = new QName("http://API.oc.sd.com/", "findAllBooks");
    private final static QName _FindBookByIdResponse_QNAME = new QName("http://API.oc.sd.com/", "findBookByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sd.oc.proxies.generated.bookAPI
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindBookByIdResponse }
     * 
     */
    public FindBookByIdResponse createFindBookByIdResponse() {
        return new FindBookByIdResponse();
    }

    /**
     * Create an instance of {@link FindBookById }
     * 
     */
    public FindBookById createFindBookById() {
        return new FindBookById();
    }

    /**
     * Create an instance of {@link FindAllBooks }
     * 
     */
    public FindAllBooks createFindAllBooks() {
        return new FindAllBooks();
    }

    /**
     * Create an instance of {@link FindAllBooksResponse }
     * 
     */
    public FindAllBooksResponse createFindAllBooksResponse() {
        return new FindAllBooksResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBookById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "findBookById")
    public JAXBElement<FindBookById> createFindBookById(FindBookById value) {
        return new JAXBElement<FindBookById>(_FindBookById_QNAME, FindBookById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "findAllBooksResponse")
    public JAXBElement<FindAllBooksResponse> createFindAllBooksResponse(FindAllBooksResponse value) {
        return new JAXBElement<FindAllBooksResponse>(_FindAllBooksResponse_QNAME, FindAllBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "findAllBooks")
    public JAXBElement<FindAllBooks> createFindAllBooks(FindAllBooks value) {
        return new JAXBElement<FindAllBooks>(_FindAllBooks_QNAME, FindAllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBookByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "findBookByIdResponse")
    public JAXBElement<FindBookByIdResponse> createFindBookByIdResponse(FindBookByIdResponse value) {
        return new JAXBElement<FindBookByIdResponse>(_FindBookByIdResponse_QNAME, FindBookByIdResponse.class, null, value);
    }

}
