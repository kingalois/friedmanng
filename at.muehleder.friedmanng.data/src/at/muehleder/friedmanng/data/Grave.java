package at.muehleder.friedmanng.data;

import java.util.UUID;

import org.eclipse.ui.IMemento;

import at.muehleder.friedmanng.data.shared.interfaces.GraveDataInterface;
import at.muehleder.friedmanng.data.shared.interfaces.GraveInterface;
import at.muehleder.friedmanng.data.shared.interfaces.GraveOwnerInterface;

public class Grave implements GraveInterface {
	
	private final UUID uuid;
	
	public Grave(UUID uuid) {
		this.uuid = uuid;
	}
	
	@Override
	public UUID getUuid() {
		return uuid;
	}

	@Override
	public GraveDataInterface getGraveData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GraveOwnerInterface getOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public void serialize(IMemento memento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deserialize(IMemento memento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setOwner(GraveOwnerInterface owner) {
		// TODO Auto-generated method stub
		
	}

}
