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

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.jdf.Address;
import org.cip4.lib.xjdf.schema.jdf.ComChannel;
import org.cip4.lib.xjdf.schema.jdf.Company;
import org.cip4.lib.xjdf.schema.jdf.Contact;
import org.cip4.lib.xjdf.schema.jdf.Person;

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
	private ContactBuilder() {

		// initialize objects
		super(XJdfNodeFactory.newInstance().createContact());

		xJdfNodeFactory = XJdfNodeFactory.newInstance();
	}

	/**
	 * Create and return a new instance of ContactBuilder.
	 * @return New ProductBuilder instance.
	 */
	public static ContactBuilder newInstance() {

		// return new instance
		return new ContactBuilder();
	}

	/**
	 * Getter for product attribute.
	 * @return the product
	 */
	public Contact getContact() {
		return getNode();
	}

	/**
	 * Add contact type to contact node.
	 * @param contactType ContactType attribute to add.
	 * @return The current contact builder instance.
	 */
	public ContactBuilder addContactType(String contactType) {

		// add contact type
		getContact().getContactTypes().add(contactType);

		// return current builder
		return this;
	}

	/**
	 * Add contact type to contact node.
	 * @param contactType ContactType attribute to add.
	 * @return The current contact builder instance.
	 */
	public ContactBuilder addContactType(Object contactType) {

		// add contact type
		addContactType(contactType.toString());

		// return current builder
		return this;
	}

	/**
	 * Add array of contact types to contact node.
	 * @param contactType ContactType attribute to add.
	 * @return The current contact builder instance.
	 */
	public ContactBuilder addContactType(Object[] contactTypes) {

		// add contact type array
		if (contactTypes != null) {
			for (int i = 0; i < contactTypes.length; i++) {
				addContactType(contactTypes[i]);
			}
		}

		// return current builder
		return this;
	}

	/**
	 * Create and add person node to contact.
	 * @param familyName Persons family name.
	 * @param firstName Persons fist name.
	 * @param namePrefix Persons name prefix.
	 * @return The current contact builder instance.
	 */
	public ContactBuilder addPerson(String familyName, String firstName, String namePrefix) {

		// new person object
		Person person = xJdfNodeFactory.createPerson();
		person.setFamilyName(familyName);
		person.setFirstName(firstName);
		person.setNamePrefix(namePrefix);
		getContact().getPersons().add(person);

		// return current builder
		return this;
	}

	/**
	 * Create and add company node to contact.
	 * @param name Organization Name.
	 * @param unit Organization Unit.
	 * @return The current contact builder instance.
	 */
	public ContactBuilder addCompany(String name, String unit) {

		// new company object
		Company company = xJdfNodeFactory.createCompany();
		company.setOrganizationName(name);
		company.setOrganizationalUnit(unit);
		getContact().getCompanies().add(company);

		// return current builder
		return this;
	}

	/**
	 * Create and add address node to contact.
	 * @param street Street attribute in address.
	 * @param postalCode PostalCode attribute in address.
	 * @param city City attribute in address.
	 * @param country Country attribute in address.
	 * @return The current contact builder instance.
	 */
	public ContactBuilder addAddress(String street, String postalCode, String city, String country) {

		// new address object
		Address address = xJdfNodeFactory.createAddress();
		address.setStreet(street);
		address.setPostalCode(postalCode);
		address.setCity(city);
		address.setCountry(country);
		getContact().getAddresses().add(address);

		// return current builder
		return this;
	}

	/**
	 * Create and add ComChannel node to contact.
	 * @param channelType ChannelType attribute in node.
	 * @param locator Locator attribute in node.
	 * @return The current contact builder instance.
	 */
	public ContactBuilder addComChannel(String channelType, String locator) {

		// new comchannel object
		ComChannel comChannel = xJdfNodeFactory.createComChannel();
		comChannel.setChannelType(channelType);
		comChannel.setLocator(locator);
		getContact().getComChannels().add(comChannel);

		// return current builder
		return this;
	}
}
