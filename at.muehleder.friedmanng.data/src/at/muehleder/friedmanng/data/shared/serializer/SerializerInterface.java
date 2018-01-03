package at.muehleder.friedmanng.data.shared.serializer;

import at.muehleder.friedmanng.data.shared.interfaces.DataManagerInterface;

public interface SerializerInterface {
	
	public void serialize(DataManagerInterface dataManager);
	
	public void deserialize(DataManagerInterface dataManager);

}
