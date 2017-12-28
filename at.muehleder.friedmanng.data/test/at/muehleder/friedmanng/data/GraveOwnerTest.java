package at.muehleder.friedmanng.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class GraveOwnerTest {
	
	@Test
	public void testSetterAndGetter() {
		GraveOwner owner = new GraveOwner();
		owner.setFirstName("Hugo");
		owner.setFamilyName("Muster");
		owner.setHouseNumber(8);
		owner.setPostalCode(4512);
		owner.setStreetName("Bergstraﬂe");
		owner.setTown("Ort");
		
		assertEquals("Hugo", owner.getFirstName());
		assertEquals("Muster", owner.getFamilyName());
		assertEquals(8, owner.getHouseNumber());
		assertEquals(4512, owner.getPostalCode());
		assertEquals("Bergstraﬂe", owner.getStreetName());
		assertEquals("Ort", owner.getTown());
		
	}

}
