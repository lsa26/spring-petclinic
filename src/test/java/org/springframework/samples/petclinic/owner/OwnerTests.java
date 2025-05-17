package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OwnerTests {

	@Test
	public void testGetFullDetails() {
		// Arrange
		Owner owner = new Owner();

		// Act
		String result = owner.getFullDetails();

		// Assert
		assertEquals("0123456789 , 123 Rue de Paris, Paris", result);
	}

}
