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

import org.cip4.lib.xjdf.schema.JMF;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit Test Case for JmfBuilder
 * @author s.meissner
 * @date 07.12.2012
 */
public class JmfBuilderTest extends AbstractBuilderTest<JMF> {

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
	 * Test method for {@link org.cip4.lib.xjdf.builder.JmfBuilder#newInstance(java.lang.String, java.lang.String)}.
	 * @throws Exception
	 */
	@Test
	public void testInitAttributes() throws Exception {

		// arrange
		final String SENDER_ID = "SenderID";
		final String DEVICE_ID = "DeviceID";
		final String VERSION = "2.0";

		// act
		jmfBuilder = new JmfBuilder(SENDER_ID, DEVICE_ID);

		// arrange
		byte[] bytes = marsahlResult(jmfBuilder);

		String actualSenderID = getXPathValue(bytes, "/xjdf:JMF/@SenderID");
		Assert.assertEquals("SenderID is wrong.", SENDER_ID, actualSenderID);

		String actualDeviceID = getXPathValue(bytes, "/xjdf:JMF/@DeviceID");
		Assert.assertEquals("DeviceID is wrong.", DEVICE_ID, actualDeviceID);

		String actualVersion = getXPathValue(bytes, "/xjdf:JMF/@Version");
		Assert.assertEquals("Version is wrong.", VERSION, actualVersion);
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

		String actualSenderID = getXPathValue(bytes, "/xjdf:JMF/@SenderID");
		Assert.assertEquals("SenderID is wrong.", SENDER_ID, actualSenderID);

		String actualDeviceID = getXPathValue(bytes, "/xjdf:JMF/@DeviceID");
		Assert.assertNotNull("DeviceID is wrong.", actualDeviceID);
	}

}
