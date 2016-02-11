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

import junit.framework.Assert;

import org.cip4.lib.xjdf.schema.XJMF;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit Test Case for JmfBuilder
 * @author s.meissner
 * @date 07.12.2012
 */
public class JmfBuilderTest extends AbstractBuilderTest<XJMF> {

	private JmfBuilder jmfBuilder;

	/**
	 * Setup unit test.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

	}

	/**
	 * Tear down unit test.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {

		// clean up builder
		jmfBuilder = null;
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.builder.JmfBuilder#newInstance(java.lang.String)}.
	 * @throws Exception
	 */
	@Test
	public void testInitAttributes2() throws Exception {

		// arrange
		final String SENDER_ID = "SenderID";

		// act
		jmfBuilder = new JmfBuilder(SENDER_ID);

		// arrange
		byte[] bytes = marsahlResult(jmfBuilder);

		String actualSenderID = getXPathValue(bytes, "/xjdf:XJMF/@SenderID");
		Assert.assertEquals("SenderID is wrong.", SENDER_ID, actualSenderID);

		String actualDeviceID = getXPathValue(bytes, "/xjdf:XJMF/@DeviceID");
		Assert.assertNotNull("DeviceID is wrong.", actualDeviceID);
	}

}
