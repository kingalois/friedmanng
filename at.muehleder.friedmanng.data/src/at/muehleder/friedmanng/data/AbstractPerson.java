package at.muehleder.friedmanng.data;

import java.util.UUID;

import org.eclipse.ui.IMemento;

import at.muehleder.friedmanng.commons.Constants;
import at.muehleder.friedmanng.data.shared.interfaces.PersonInterface;

public class AbstractPerson implements PersonInterface {
	
	private final UUID uuid;
	private String firstname = Constants.EMPTY;
	private String surname = Constants.EMPTY;
	private String street = Constants.EMPTY;
	private String houseNr = Constants.EMPTY;
	private String postalCode = Constants.EMPTY;
	private String town = Constants.EMPTY;
	private String telephon = Constants.EMPTY;
	
	public AbstractPerson(UUID uuid) {
		this.uuid = uuid;
	}

	@Override
	public UUID getUuid() {
		return uuid;
	}

	@Override
	public void setTelephon(String telephon) {
		this.telephon = telephon;
	}

	@Override
	public String getTelephon() {
		return telephon;
	}

	@Override
	public String getFullName() {
		return getFirstName() + Constants.SPACE + getSurname();
	}

	@Override
	public String getSurname() {
		return surname;
	}

	@Override
	public String getFirstName() {
		return firstname;
	}

	@Override
	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public void setFirstName(String firstname) {
		this.firstname = firstname;

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getFullName()).append(Constants.SPACE);
		builder.append(street).append(Constants.SPACE);
		builder.append(houseNr).append(Constants.SPACE);
		builder.append(town).append(Constants.SPACE);
		builder.append(postalCode).append(Constants.SPACE);
		builder.append(telephon).append(Constants.SPACE);
		return builder.toString();
	}

	@Override
	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String getStreet() {
		return street;
	}

	@Override
	public void setHouseNr(String houseNr) {
		this.houseNr = houseNr;
	}

	@Override
	public String getHouseNr() {
		return houseNr;
	}

	@Override
	public String getPostalCode() {
		return postalCode;
	}

	@Override
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String getTown() {
		return town;
	}

	@Override
	public void setTown(String town) {
		this.town = town;
	}

	@Override
	public String getDetailText() {
		StringBuilder builder = new StringBuilder();
		builder.append(firstname + " " + surname);
		builder.append(Constants.NEWLINE);
		builder.append(getStreet() + " " + getHouseNr());
		builder.append(Constants.NEWLINE);
		builder.append(getPostalCode() + " " + getTown());
		builder.append(Constants.NEWLINE);
		return builder.toString();
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractPerson other = (AbstractPerson) obj;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}
	
	

}
