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

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test case for Contact Builder.
 * @author s.meissner
 * @date 28.03.2012
 */
public class ContactBuilderTest {

	ContactBuilder contactBuilder;

	private enum TestEnum {
		VAL_1,
		value,
		Value2
	}

	/**
	 * Setup unit test.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		contactBuilder = ContactBuilder.newInstance();
	}

	/**
	 * Tear down unit test.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		contactBuilder = null;
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.builder.ContactBuilder#addContactType(java.lang.String)}.
	 */
	@Test
	public void testAddContactTypeString() {

		// arrange
		final String expected = UUID.randomUUID().toString();

		// act
		contactBuilder.addContactType(expected);

		// assert
		Assert.assertEquals("List is too long.", 1, contactBuilder.getContact().getContactTypes().size());

		String actual = contactBuilder.getContact().getContactTypes().get(0);
		Assert.assertEquals("String value is wrong.", expected, actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.builder.ContactBuilder#addContactType(java.lang.Object)}.
	 */
	@Test
	public void testAddContactTypeObject() {

		// arrange
		final String expected = "VAL_1";

		// act
		contactBuilder.addContactType(TestEnum.VAL_1);

		// assert
		Assert.assertEquals("List is too long.", 1, contactBuilder.getContact().getContactTypes().size());

		String actual = contactBuilder.getContact().getContactTypes().get(0);
		Assert.assertEquals("String value is wrong.", expected, actual);
	}

	/**
	 * Test method for {@link org.cip4.lib.xjdf.builder.ContactBuilder#addContactType(java.lang.Object[])}.
	 */
	@Test
	public void testAddContactTypeObjectArray() {

		// arrange
		List<TestEnum> testEnumList = new ArrayList<ContactBuilderTest.TestEnum>(3);
		testEnumList.add(TestEnum.VAL_1);
		testEnumList.add(TestEnum.value);
		testEnumList.add(TestEnum.Value2);

		final String expected_1 = "VAL_1";
		final String expected_2 = "value";
		final String expected_3 = "Value2";

		// act
		contactBuilder.addContactType(testEnumList.toArray());

		// assert
		Assert.assertEquals("List is too long.", 3, contactBuilder.getContact().getContactTypes().size());

		String actual_1 = contactBuilder.getContact().getContactTypes().get(0);
		Assert.assertEquals("String value 1 is wrong.", expected_1, actual_1);

		String actual_2 = contactBuilder.getContact().getContactTypes().get(1);
		Assert.assertEquals("String value 2 is wrong.", expected_2, actual_2);

		String actual_3 = contactBuilder.getContact().getContactTypes().get(2);
		Assert.assertEquals("String value 3 is wrong.", expected_3, actual_3);
	}
}
