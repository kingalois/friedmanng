package at.muehleder.friedmanng.data;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import at.muehleder.friedmanng.data.shared.interfaces.DataCenterInterface;
import at.muehleder.friedmanng.data.shared.interfaces.DiedPersonInterface;
import at.muehleder.friedmanng.data.shared.interfaces.GraveInterface;
import at.muehleder.friedmanng.data.shared.interfaces.GraveOwnerInterface;
import at.muehleder.friedmanng.data.shared.interfaces.InternalGravePositionInterface;

public class DataCenter implements DataCenterInterface {
	
	private final Set<GraveInterface> graves = new HashSet<>();
	private final Set<GraveOwnerInterface> owners = new HashSet<>();
	private final Set<DiedPersonInterface> diedPersons = new HashSet<>();

	@Override
	public Collection<GraveInterface> getAllGraves() {
		return graves;
	}

	@Override
	public Collection<GraveOwnerInterface> getAllGraveOwner() {
		return owners;
	}

	@Override
	public Collection<DiedPersonInterface> getAllDiedPerson() {
		return diedPersons;
	}

	@Override
	public void addDiedPersonToGrave(DiedPersonInterface diedPerson, GraveInterface grave, InternalGravePositionInterface internalPos) {
		diedPerson.setGrave(grave);
		grave.getGraveData().addDiedPerson(diedPerson, internalPos);
		putDiedPerson(diedPerson);
		putGrave(grave);
		

	}

	private void putGrave(GraveInterface grave) {
		graves.remove(grave);
		graves.add(grave);
	}

	private void putDiedPerson(DiedPersonInterface diedPerson) {
		diedPersons.remove(diedPerson);
		diedPersons.add(diedPerson);
	}

	@Override
	public void addGrave(GraveInterface grave) {
		putGrave(grave);

	}

	@Override
	public void addGraveToOwner(GraveInterface grave, GraveOwnerInterface owner) {
		grave.setOwner(owner);
		owner.addGrave(grave);
		putGrave(grave);
		putOwner(owner);

	}

	private void putOwner(GraveOwnerInterface owner) {
		owners.remove(owner);
		owners.add(owner);
		
	}

	@Override
	public void addGraveOwner(GraveOwnerInterface graveOwner) {
		putOwner(graveOwner);

	}

	@Override
	public void addDiedPerson(DiedPersonInterface diedPerson) {
		putDiedPerson(diedPerson);
		
	}

}
