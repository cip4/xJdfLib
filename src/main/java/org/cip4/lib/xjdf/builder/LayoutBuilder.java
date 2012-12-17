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
import org.cip4.lib.xjdf.schema.Layout;

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
	 * Getter for layout attribute.
	 * @return the layout
	 */
	protected Layout getLayout() {
		return getNode();
	}

}
