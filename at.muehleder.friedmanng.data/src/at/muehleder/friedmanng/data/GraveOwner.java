package at.muehleder.friedmanng.data;

import java.util.UUID;

import at.muehleder.friedmanng.data.shared.interfaces.GraveOwnerInterface;

public class GraveOwner extends AbstractPerson implements GraveOwnerInterface {

	public GraveOwner(UUID uuid) {
		super(uuid);
	}
	

}

