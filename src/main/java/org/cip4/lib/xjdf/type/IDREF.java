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
package org.cip4.lib.xjdf.type;

import javax.xml.bind.ValidationException;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.Parameter;
import org.cip4.lib.xjdf.schema.ParameterType;
import org.cip4.lib.xjdf.schema.Part;
import org.cip4.lib.xjdf.schema.Product;
import org.cip4.lib.xjdf.util.IDGeneratorUtil;

/**
 * DataType for IDRefs
 * @author s.meissner
 * @date 08.04.2013
 */
public class IDREF extends AbstractXJdfType<String, IDREF> {

	private final String id;

	private final Object element;

	/**
	 * Default constructor.
	 */
	public IDREF() {
		this.id = "";
		element = null;
	}

	/**
	 * Getter for id attribute.
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	public Parameter getParameter() {
		return (Parameter) element;
	}

	public Product getProduct() {
		return (Product) element;
	}

	public IDREF(ParameterType parameterType) {
		this(parameterType, null, IDGeneratorUtil.generateID("PAR"));
	}

	public IDREF(ParameterType parameterType, Part part, String id) {

		// generate ID
		this.id = id;

		// create parameter
		XJdfNodeFactory nf = new XJdfNodeFactory();
		Parameter parameter = nf.createParameter(parameterType, part);
		parameter.setID(this.id);

		// set element
		this.element = parameter;
	}

	public IDREF(Product product) throws ValidationException {
		this(product, IDGeneratorUtil.generateID("PRD"));
	}

	public IDREF(Product product, String id) throws ValidationException {

		// generate ID
		this.id = id;

		// update id
		product.setID(id);

		// validation
		if (product.getChildProduct().size() > 0) {
			throw new ValidationException("A Child Product cannot have children!");
		}

		this.element = product;

	}

	/**
	 * Custom constructor. Accepting accepting a String expression for initializing..
	 */
	public IDREF(final String expression) {
		id = expression;
		this.element = null;
	}

	/**
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
	 */
	@Override
	public String marshal(IDREF idRef) {
		if (idRef == null)
			return null;

		return idRef.getId();
	}

	/**
	 * @see javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
	 */
	@Override
	public IDREF unmarshal(String v) {
		return new IDREF(v);
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return marshal(this);
	}

}
