package at.muehleder.friedmanng.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import at.muehleder.friedmanng.data.shared.interfaces.ComponentProvider;
import at.muehleder.friedmanng.data.shared.interfaces.DataCenterInterface;

public class DataCenterTest {
	
	@Test
	public void testDifferentAddMethods() {
		DataCenterInterface dc = new DataCenter();
		
		assertEquals(0, dc.getAllDiedPerson().size());
		assertEquals(0, dc.getAllGraveOwner().size());
		assertEquals(0, dc.getAllGraves().size());
		
		dc.addGraveOwner(ComponentProvider.createNewOwner());
		assertEquals(0, dc.getAllDiedPerson().size());
		assertEquals(1, dc.getAllGraveOwner().size());
		assertEquals(0, dc.getAllGraves().size());
		
		dc.addDiedPerson(ComponentProvider.createNewDiedPerson());
		assertEquals(1, dc.getAllDiedPerson().size());
		assertEquals(1, dc.getAllGraveOwner().size());
		assertEquals(0, dc.getAllGraves().size());
		
		
		dc.addGrave(ComponentProvider.createNewGrave());
		assertEquals(1, dc.getAllDiedPerson().size());
		assertEquals(1, dc.getAllGraveOwner().size());
		assertEquals(1, dc.getAllGraves().size());
		
		
		
		
	}

}
