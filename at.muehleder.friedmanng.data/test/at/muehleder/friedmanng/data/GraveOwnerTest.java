package at.muehleder.friedmanng.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;

import org.junit.Test;

public class GraveOwnerTest {
	
	@Test
	public void testSetterAndGetter() {
		GraveOwner owner = new GraveOwner(UUID.randomUUID());
		owner.setFirstName("Hugo");
		owner.setSurname("Muster");
		owner.setHouseNr("5");
		owner.setPostalCode("4252");
		owner.setStreet("Bergstraﬂe");
		owner.setTown("Ort");
		
		assertEquals("Hugo", owner.getFirstName());
		assertEquals("Muster", owner.getSurname());
		assertEquals("5", owner.getHouseNr());
		assertEquals("4252", owner.getPostalCode());
		assertEquals("Bergstraﬂe", owner.getStreet());
		assertEquals("Ort", owner.getTown());
		
	}

}
