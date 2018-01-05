package at.muehleder.friedmanng.data.shared.interfaces;

import java.util.Collection;

public interface DataCenterInterface {
	
	
	public Collection<GraveInterface> getAllGraves();
	
	public Collection<GraveOwnerInterface> getAllGraveOwner();
	
	public Collection<DiedPersonInterface> getAllDiedPerson();
	
	public void addDiedPersonToGrave(DiedPersonInterface diedPerson, GraveInterface grave, InternalGravePositionInterface internalPos);
	
	public void addGrave(GraveInterface grave);
	
	public void addGraveToOwner(GraveInterface grave, GraveOwnerInterface owner);
	
	public void addGraveOwner(GraveOwnerInterface graveOwner);
	
	public void addDiedPerson(DiedPersonInterface diedPerson);
	

}
