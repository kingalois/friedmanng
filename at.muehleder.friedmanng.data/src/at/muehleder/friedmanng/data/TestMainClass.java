package at.muehleder.friedmanng.data;

import java.util.logging.Level;
import java.util.logging.Logger;

import at.muehleder.friedmanng.logging.LoggerFactory;



public class TestMainClass {
	
	private static final Logger LOGGER = LoggerFactory.makeLogger();

	public static void main(String[] args) {
		GraveOwner owner = new GraveOwner();
		owner.setFirstName("Jonas");

		GraveOwner ownername = new GraveOwner();
		ownername.setFamilyName("Mühleder");

		LOGGER.log(Level.INFO, owner.getFirstName());
		LOGGER.log(Level.INFO, ownername.getFamilyName());
	}

}
