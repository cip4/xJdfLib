/**
 * All rights reserved by
 * 
 * flyeralarm GmbH
 * Alfred-Nobel-Straße 18
 * 97080 Würzburg
 *
 * Email: info@flyeralarm.com
 * Website: http://www.flyeralarm.com
 */
package org.cip4.lib.xjdf.builder;

import javax.xml.bind.JAXBException;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.Address;
import org.cip4.lib.xjdf.schema.ComChannel;
import org.cip4.lib.xjdf.schema.Company;
import org.cip4.lib.xjdf.schema.Contact;
import org.cip4.lib.xjdf.schema.Person;
import org.w3c.dom.Node;

/**
 * Builder class for simplify creating default XJDF Contact Nodes.
 * @author s.meissner
 * @date 28.03.2012
 */
public class ContactBuilder extends AbstractNodeBuilder<Contact> {

	private final XJdfNodeFactory xJdfNodeFactory;

	/**
	 * Default constructor.
	 */
	public ContactBuilder() {

		// initialize objects
		super(new XJdfNodeFactory().createContact());
		xJdfNodeFactory = new XJdfNodeFactory();
	}

	/**
	 * Custom constructor. Accepting a W3C Node object for initializing.
	 * @param node W2C Node object for
	 * @throws JAXBException
	 */
	public ContactBuilder(Node contactNode) throws JAXBException {

		super(contactNode, Contact.class);

		// init factory
		xJdfNodeFactory = new XJdfNodeFactory();
	}

	/**
	 * Getter for product attribute.
	 * @return the product
	 */
	protected Contact getContact() {
		return getNode();
	}

	/**
	 * Custom Constructor. Creates a new instance of ContactBuilder based on a existing Contact Node.
	 * @param contact Contact node for initializing.
	 */
	public ContactBuilder(Contact contact) {

		// call super class
		super(contact);

		// init
		xJdfNodeFactory = new XJdfNodeFactory();
	}

	/**
	 * Add contact type to contact node.
	 * @param contactType ContactType attribute to add.
	 * @return The current contact builder instance.
	 */
	public void addContactType(String contactType) {

		// add contact type
		getContact().getContactTypes().add(contactType);
	}

	/**
	 * Add contact type to contact node.
	 * @param contactType ContactType attribute to add.
	 * @return The current contact builder instance.
	 */
	public void addContactType(Object contactType) {

		// add contact type
		addContactType(contactType.toString());
	}

	/**
	 * Add array of contact types to contact node.
	 * @param contactType ContactType attribute to add.
	 * @return The current contact builder instance.
	 */
	public void addContactType(Object[] contactTypes) {

		// add contact type array
		if (contactTypes != null) {
			for (int i = 0; i < contactTypes.length; i++) {
				addContactType(contactTypes[i]);
			}
		}
	}

	/**
	 * Create and add person node to contact.
	 * @param familyName Persons family name.
	 * @param firstName Persons fist name.
	 * @param namePrefix Persons name prefix.
	 * @return The current contact builder instance.
	 */
	public Person addPerson(String familyName, String firstName, String namePrefix) {

		// new person object
		Person person = xJdfNodeFactory.createPerson();
		person.setFamilyName(familyName);
		person.setFirstName(firstName);
		person.setNamePrefix(namePrefix);
		getContact().getPerson().add(person);

		// return current builder
		return person;
	}

	/**
	 * Create and add company node to contact.
	 * @param name Organization Name.
	 * @return The current contact builder instance.
	 */
	public Company addCompany(String organizationName) {

		return addCompany(organizationName, null);
	}

	/**
	 * Create and add company node to contact.
	 * @param name Organization Name.
	 * @param unit Organization Unit.
	 * @return The current contact builder instance.
	 */
	public Company addCompany(String organizationName, String unit) {

		// new company object
		Company company = xJdfNodeFactory.createCompany();
		company.setOrganizationName(organizationName);
		company.setOrganizationalUnit(unit);
		getContact().getCompany().add(company);

		// return current builder
		return company;
	}

	public Address addAddress(String street, String postalCode, String city) {

		// return current builder
		return addAddress(street, postalCode, city, null, null);
	}

	/**
	 * Create and add address node to contact.
	 * @param street Street attribute in address.
	 * @param postalCode PostalCode attribute in address.
	 * @param city City attribute in address.
	 * @param country Country attribute in address.
	 * @param countryCode CountryCode attribute in address.
	 * @return The current contact builder instance.
	 */
	public Address addAddress(String street, String postalCode, String city, String country, String countryCode) {

		// new address object
		Address address = xJdfNodeFactory.createAddress();
		address.setStreet(street);
		address.setPostalCode(postalCode);
		address.setCity(city);
		address.setCountry(country);
		address.setCountryCode(countryCode);
		getContact().getAddress().add(address);

		// return current builder
		return address;
	}

	/**
	 * Create and add ComChannel node to contact.
	 * @param channelType ChannelType attribute in node.
	 * @param locator Locator attribute in node.
	 * @return The current contact builder instance.
	 */
	public ComChannel addComChannel(String channelType, String locator) {

		return addComChannel(channelType, locator, null);
	}

	/**
	 * Create and add ComChannel node to contact.
	 * @param channelType ChannelType attribute in node.
	 * @param locator Locator attribute in node.
	 * @param channelTypeDetails ChannelTypeDetails attribute in node.
	 * @return The current contact builder instance.
	 */
	public ComChannel addComChannel(String channelType, String locator, String channelTypeDetails) {

		// new ComChannel object
		ComChannel comChannel = xJdfNodeFactory.createComChannel();
		comChannel.setChannelType(channelType);
		comChannel.setLocator(locator);
		comChannel.setChannelTypeDetails(channelTypeDetails);
		getContact().getComChannel().add(comChannel);

		// return current builder
		return comChannel;
	}
}
