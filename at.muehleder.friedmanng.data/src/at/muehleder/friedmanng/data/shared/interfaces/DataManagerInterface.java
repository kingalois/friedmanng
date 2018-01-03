package at.muehleder.friedmanng.data.shared.interfaces;

import java.util.Collection;

public interface DataManagerInterface {
	
	
	public Collection<GraveInterface> getAllGraves();
	
	public Collection<GraveOwnerInterface> getAllGraveOwner();
	
	public Collection<DiedPersonInterface> getAllDiedPerson();

}
