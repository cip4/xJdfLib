/**
 * All rights reserved by
 * 
 * flyeralarm GmbH
 * Alfred-Nobel-Straße 18
 * 97080 Würzburg
 *
 * info@flyeralarm.com
 * http://www.flyeralarm.com
 */
package org.cip4.lib.xjdf;

import org.cip4.lib.xjdf.schema.jdf.Address;
import org.cip4.lib.xjdf.schema.jdf.ComChannel;
import org.cip4.lib.xjdf.schema.jdf.Company;
import org.cip4.lib.xjdf.schema.jdf.Contact;
import org.cip4.lib.xjdf.schema.jdf.FileSpec;
import org.cip4.lib.xjdf.schema.jdf.GeneralID;
import org.cip4.lib.xjdf.schema.jdf.ObjectFactory;
import org.cip4.lib.xjdf.schema.jdf.Product;
import org.cip4.lib.xjdf.schema.jdf.RunList;

/**
 * Static Factory Class which is managing the creation of XJdfNodes.
 * @author s.meissner
 * @date 05.03.2012
 */
public class XJdfNodeFactory extends ObjectFactory {

	/**
	 * Private default constructor. Class cannot being instantiated from external.
	 */
	private XJdfNodeFactory() {
		// no action
	}

	/**
	 * Get instance of XJdfNodeFactory.
	 * @return
	 */
	public static XJdfNodeFactory getInstance() {
		return new XJdfNodeFactory();
	}

	/**
	 * Create a new pre-filled GeneralID Node.
	 * @param idUsage Value of node attribute 'IDUsage'.
	 * @param idValue Value of node attribute 'IDValue'.
	 * @return Pre-filled GeneralID object.
	 */
	public GeneralID createGeneralID(String idUsage, String idValue) {
		// create new GeneralID object
		GeneralID generalId = XJdfNodeFactory.getInstance().createGeneralID();
		generalId.setIDUsage(idUsage);
		generalId.setIDValue(idValue);

		// return GeneralID
		return generalId;
	}

	/**
	 * Create a new RunList Node which already contains a FileSpec URL definition.
	 * @param fileSpecUrl URL attribute in element FileSpec.
	 * @return RunList Node which already contains a FileSpec URL definition.
	 */
	public RunList createRunList(String fileSpecUrl) {
		// create RunList Node
		RunList runList = super.createRunList();

		// extend by FileSpec element
		FileSpec fileSpec = createFileSpec();
		fileSpec.setURL(fileSpecUrl);
		runList.setFileSpec(fileSpec);

		// return runList
		return runList;
	}

	/**
	 * Create a new Product Node which already contains the attribute 'amount'.
	 * @param amount Product Node Attribute 'amount' to set.
	 * @return Product Node which already contains the attribute 'amount'.
	 */
	public Product createProduct(int amount) {
		// create Product Node
		Product product = super.createProduct();

		// set amount
		product.setAmount(amount);

		// return product
		return product;
	}

	/**
	 * Create a new ComChannel Node which already contains defined attributes.
	 * @param channelType ComChannel Node Attribute 'ChannelType' to set.
	 * @param channelUsage ComChannel Node Attribute 'ChannelUsage' to set.
	 * @param locator ComChannel Node Attribute 'Locator' to set.
	 * @return ComChannel Node which already contains defined attributes.
	 */
	public ComChannel createComChannel(String channelType, String channelUsage, String locator) {
		// create ComChannel Node
		ComChannel comChannel = super.createComChannel();

		// set attributes
		comChannel.setChannelType(channelType);
		comChannel.getChannelUsages().add(channelUsage);
		comChannel.setLocator(locator);

		// return object
		return comChannel;
	}

	/**
	 * Create a new Address Node which already contains defined attributes.
	 * @param street Address Node Attribute 'Street' to set.
	 * @param postalCode Address Node Attribute 'PostalCode' to set.
	 * @param city Address Node Attribute 'City' to set.
	 * @param country Address Node Attribute 'Country' to set.
	 * @return Address Node which already contains defined attributes.
	 */
	public Address createAddress(String street, String postalCode, String city, String country) {
		// create Address Node
		Address address = super.createAddress();

		// set attributes
		address.setStreet(street);
		address.setPostalCode(postalCode);
		address.setCity(city);
		address.setCountry(country);

		// return object
		return address;
	}

	/**
	 * Create a new Company Node which already contains defined attributes.
	 * @param name Company Node Attribute 'OrganizationName' to set.
	 * @param unit Company Node Attribute 'OrganizationUnit' to set.
	 * @return Company Node which already contains defined attributes.
	 */
	public Company createCompany(String name, String unit) {
		// create Company Node
		Company company = super.createCompany();

		// set attributes
		company.setOrganizationName(name);
		company.setOrganizationalUnit(unit);

		// return object
		return company;
	}

	/**
	 * Create a new Contact Node which already contains defined attributes.
	 * @param contactTypes Contact Node Attribute 'ContactTypes' to set.
	 * @return Contact Node which already contains defined attributes.
	 */
	public Contact createContact(String... contactTypes) {
		// create Contact Node
		Contact contact = super.createContact();

		// set attributes
		for (int i = 0; contactTypes != null && i < contactTypes.length; i++) {
			contact.getContactTypes().add(contactTypes[i]);
		}

		// return object
		return contact;
	}
}
