package at.muehleder.friedmanng.data.shared.interfaces;

import java.util.Collection;

public interface GraveDataInterface extends UniqueObjectInterface, SerializableObject {
	
	
	public Collection<DiedPersonInterface> getDiedPersons();
	
	public void addDiedPerson(DiedPersonInterface diedPerson, InternalGravePositionInterface internalPosition);
	
	

}
