package com.necessarysense.maven.uberjar;

import org.junit.Assert;
import org.junit.Test;

public class MessageHolderTest {
	@Test
	public void testMessageContents() {
		MessageHolder messageHolder = new MessageHolder();
		Assert.assertEquals("Message should be 'Hola Mundo'", "Hola Mundo", messageHolder.getMessage());
	}
}
