package at.muehleder.friedmanng.data;

import java.util.Collection;
import java.util.UUID;

import at.muehleder.friedmanng.data.shared.interfaces.GraveInterface;
import at.muehleder.friedmanng.data.shared.interfaces.GraveOwnerInterface;

public class GraveOwner extends AbstractPerson implements GraveOwnerInterface {

	public GraveOwner(UUID uuid) {
		super(uuid);
	}

	@Override
	public Collection<GraveInterface> getGraves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addGrave(GraveInterface grave) {
		// TODO Auto-generated method stub
		
	}
	

}

