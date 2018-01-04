package at.muehleder.friedmanng.data.serializer;

import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.ui.XMLMemento;

import at.muehleder.friedmanng.data.shared.serializer.SerializerInterface;
import at.muehleder.friedmanng.logging.LoggerFactory;

public class XMLFileSerializer implements SerializerInterface {
	
	private static final Logger LOG = LoggerFactory.makeLogger();
	private static final String ROOT = "friedmanng";
	
	private final String file;
	
	public XMLFileSerializer(String file) {
		this.file = file;
	}

	@Override
	public void serialize() {
		try(FileWriter reader = new FileWriter(file);) {
			
			XMLMemento memento = XMLMemento.createWriteRoot(ROOT);
			
		} catch (Exception e) {
			LOG.log(Level.SEVERE, "could not serialize data", e);
		}
		
	}

	@Override
	public void deserialize() {
		// TODO Auto-generated method stub

	}

}
