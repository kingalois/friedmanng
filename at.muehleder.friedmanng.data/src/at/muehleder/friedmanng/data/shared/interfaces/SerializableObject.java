package at.muehleder.friedmanng.data.shared.interfaces;

import org.eclipse.ui.IMemento;

public interface SerializableObject {
	
	public void serialize(IMemento memento);
	
	public void deserialize(IMemento memento);

}
