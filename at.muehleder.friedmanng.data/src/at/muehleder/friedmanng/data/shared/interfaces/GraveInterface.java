package at.muehleder.friedmanng.data.shared.interfaces;

public interface GraveInterface extends UniqueObjectInterface, SerializableObject {
	
	public GraveDataInterface getGraveData();
	
	public GraveOwnerInterface getOwner();
	
	public void setOwner(GraveOwnerInterface owner);
	

}
