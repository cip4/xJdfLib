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

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.cip4.lib.xjdf.XJdfNodeFactory;
import org.cip4.lib.xjdf.schema.ContentObject;
import org.cip4.lib.xjdf.schema.Layout;
import org.cip4.lib.xjdf.schema.MarkObject;
import org.cip4.lib.xjdf.schema.PlacedObject;
import org.cip4.lib.xjdf.type.Rectangle;
import org.cip4.lib.xjdf.xml.XJdfConstants;

/**
 * Implementation of the Layout Builder.
 * @author stefan.meissner
 * @date 17.12.2012
 */
public class LayoutBuilder extends AbstractNodeBuilder<Layout> {

	private final XJdfNodeFactory xJdfNodeFactory;

	/**
	 * Default constructor.
	 */
	private LayoutBuilder() {

		// initialize objects
		super(XJdfNodeFactory.newInstance().createLayout());

		xJdfNodeFactory = XJdfNodeFactory.newInstance();
	}

	/**
	 * Create and return a new instance of LayoutBuilder.
	 * @return New LayoutBuilder instance.
	 */
	public static LayoutBuilder newInstance() {

		// return new instance
		return new LayoutBuilder();
	}

	/**
	 * Create and return a new instance of LayoutBuilder, which already contains preconfigured values.
	 * @param surfaceContentsBox Value of SurfaceContentsBox Attribute.
	 * @return New LayoutBuilder instance.
	 */
	public static LayoutBuilder newInstance(Rectangle surfaceContentsBox) {

		// new instance
		LayoutBuilder builder = newInstance();

		// set attributes
		builder.getLayout().setSurfaceContentsBox(surfaceContentsBox);

		// return instance
		return builder;
	}

	/**
	 * Add MarkObject to Layout Definition.
	 * @param markObject MarkObject to append to.
	 * @return The current LayoutBuilder instance.
	 */
	public LayoutBuilder addMarkObject(MarkObject markObject) {
		return addPlacedObject(markObject);
	}

	/**
	 * Add ContentObject to Layout Definition.
	 * @param contentObject ContentObject to append to.
	 * @return The current LayoutBuilder instance.
	 */
	public LayoutBuilder addContentObject(ContentObject contentObject) {
		return addPlacedObject(contentObject);
	}

	/**
	 * Append a PlacedObject node (MarkObject or ContentObject) to Layout Definition.
	 * @param intent Intent object to append to.
	 * @return The current LayoutBuilder instance.
	 */
	public LayoutBuilder addPlacedObject(PlacedObject placedObject) {

		// create JAXBElement
		String objName = placedObject.getClass().getSimpleName();
		QName qname = new QName(XJdfConstants.NAMESPACE_JDF20, objName);
		JAXBElement obj = new JAXBElement(qname, objName.getClass(), null, objName);

		// append intent to product
		getLayout().getPlacedObject().add(obj);

		// return current builder
		return this;
	}

	/**
	 * Getter for layout attribute.
	 * @return the layout
	 */
	protected Layout getLayout() {
		return getNode();
	}

}
