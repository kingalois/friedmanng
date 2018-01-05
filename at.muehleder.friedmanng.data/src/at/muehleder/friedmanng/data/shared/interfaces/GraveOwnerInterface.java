package at.muehleder.friedmanng.data.shared.interfaces;

import java.util.Collection;

public interface GraveOwnerInterface extends PersonInterface {
	
	public Collection<GraveInterface> getGraves();
	
	public void addGrave(GraveInterface grave);
	
	
	

}
