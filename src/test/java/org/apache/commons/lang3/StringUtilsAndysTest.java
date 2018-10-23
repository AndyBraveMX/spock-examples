package org.apache.commons.lang3;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringUtilsAndysTest {
	
	CharSequence emptyString = "";
	CharSequence whiteString = " ";
	CharSequence multipleSpacesString = "      ";
	CharSequence notNullString = "Andres";

	@Test
	void testIsEmpty() {
		assertTrue(StringUtils.isEmpty(emptyString));
		assertFalse(StringUtils.isEmpty(whiteString));
		assertFalse(StringUtils.isEmpty(multipleSpacesString));
		assertFalse(StringUtils.isEmpty(notNullString));
	}
	
	@Test
	public void testAnyEmpty() {
		assertTrue(StringUtils.isAnyEmpty(emptyString));
		assertTrue(StringUtils.isAnyEmpty(emptyString, whiteString));
		assertFalse(StringUtils.isAnyEmpty(notNullString, whiteString));
	}
	
	@Test
	public void testIsBlank() {
		assertTrue(StringUtils.isBlank(emptyString));
		assertTrue(StringUtils.isBlank(whiteString));
		assertTrue(StringUtils.isBlank(multipleSpacesString));
		assertFalse(StringUtils.isBlank(notNullString));
	}

}
