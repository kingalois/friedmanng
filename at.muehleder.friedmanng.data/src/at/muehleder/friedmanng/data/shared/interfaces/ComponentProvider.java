package at.muehleder.friedmanng.data.shared.interfaces;

import java.util.UUID;

import at.muehleder.friedmanng.data.DataCenter;
import at.muehleder.friedmanng.data.DiedPerson;
import at.muehleder.friedmanng.data.Grave;
import at.muehleder.friedmanng.data.GraveOwner;

public class ComponentProvider {
	
	private static DataCenterInterface dataCenter = null;
	
	public static DataCenterInterface getOrCreateDataCenter() {
		if(dataCenter == null) {
			dataCenter = new DataCenter();
		}
		return dataCenter;
	}
	
	public static GraveOwnerInterface createNewOwner() {
		return new GraveOwner(UUID.randomUUID());
	}
	
	public static GraveInterface createNewGrave() {
		return new Grave(UUID.randomUUID());
	}

	public static DiedPersonInterface createNewDiedPerson() {
		return new DiedPerson(UUID.randomUUID());
	}
}
