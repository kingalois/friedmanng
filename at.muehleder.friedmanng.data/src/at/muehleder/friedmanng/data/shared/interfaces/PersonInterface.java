package at.muehleder.friedmanng.data.shared.interfaces;

public interface PersonInterface extends UniqueObjectInterface, SerializableObject {
	

	public String getFullName();
	
	public void setSurname(String surname);

	public String getSurname();

	public String getFirstName();

	public void setFirstName(String firstname);

	public void setStreet(String street);

	public String getStreet();

	public void setHouseNr(String houseNr);

	public String getHouseNr();

	public String getDetailText();

	public String getPostalCode();

	public void setPostalCode(String postalCode);

	public String getTown();

	public void setTown(String town);

	public void setTelephon(String telephon);

	public String getTelephon();

}
