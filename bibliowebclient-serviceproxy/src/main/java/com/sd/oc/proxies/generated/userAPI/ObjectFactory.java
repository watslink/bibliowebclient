
package com.sd.oc.proxies.generated.userAPI;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sd.oc.proxies.generated.userAPI package. 
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

    private final static QName _FindAllUsers_QNAME = new QName("http://API.oc.sd.com/", "findAllUsers");
    private final static QName _FindUserById_QNAME = new QName("http://API.oc.sd.com/", "findUserById");
    private final static QName _FindUserByUsername_QNAME = new QName("http://API.oc.sd.com/", "findUserByUsername");
    private final static QName _FindUserByUsernameResponse_QNAME = new QName("http://API.oc.sd.com/", "findUserByUsernameResponse");
    private final static QName _FindAllUsersResponse_QNAME = new QName("http://API.oc.sd.com/", "findAllUsersResponse");
    private final static QName _AddUserResponse_QNAME = new QName("http://API.oc.sd.com/", "addUserResponse");
    private final static QName _AddUser_QNAME = new QName("http://API.oc.sd.com/", "addUser");
    private final static QName _FindUserByIdResponse_QNAME = new QName("http://API.oc.sd.com/", "findUserByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sd.oc.proxies.generated.userAPI
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindUserByIdResponse }
     * 
     */
    public FindUserByIdResponse createFindUserByIdResponse() {
        return new FindUserByIdResponse();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link FindUserByUsernameResponse }
     * 
     */
    public FindUserByUsernameResponse createFindUserByUsernameResponse() {
        return new FindUserByUsernameResponse();
    }

    /**
     * Create an instance of {@link FindUserById }
     * 
     */
    public FindUserById createFindUserById() {
        return new FindUserById();
    }

    /**
     * Create an instance of {@link FindUserByUsername }
     * 
     */
    public FindUserByUsername createFindUserByUsername() {
        return new FindUserByUsername();
    }

    /**
     * Create an instance of {@link FindAllUsers }
     * 
     */
    public FindAllUsers createFindAllUsers() {
        return new FindAllUsers();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link FindAllUsersResponse }
     * 
     */
    public FindAllUsersResponse createFindAllUsersResponse() {
        return new FindAllUsersResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "findAllUsers")
    public JAXBElement<FindAllUsers> createFindAllUsers(FindAllUsers value) {
        return new JAXBElement<FindAllUsers>(_FindAllUsers_QNAME, FindAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "findUserById")
    public JAXBElement<FindUserById> createFindUserById(FindUserById value) {
        return new JAXBElement<FindUserById>(_FindUserById_QNAME, FindUserById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserByUsername }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "findUserByUsername")
    public JAXBElement<FindUserByUsername> createFindUserByUsername(FindUserByUsername value) {
        return new JAXBElement<FindUserByUsername>(_FindUserByUsername_QNAME, FindUserByUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserByUsernameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "findUserByUsernameResponse")
    public JAXBElement<FindUserByUsernameResponse> createFindUserByUsernameResponse(FindUserByUsernameResponse value) {
        return new JAXBElement<FindUserByUsernameResponse>(_FindUserByUsernameResponse_QNAME, FindUserByUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "findAllUsersResponse")
    public JAXBElement<FindAllUsersResponse> createFindAllUsersResponse(FindAllUsersResponse value) {
        return new JAXBElement<FindAllUsersResponse>(_FindAllUsersResponse_QNAME, FindAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://API.oc.sd.com/", name = "findUserByIdResponse")
    public JAXBElement<FindUserByIdResponse> createFindUserByIdResponse(FindUserByIdResponse value) {
        return new JAXBElement<FindUserByIdResponse>(_FindUserByIdResponse_QNAME, FindUserByIdResponse.class, null, value);
    }

}
