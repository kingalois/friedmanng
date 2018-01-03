package at.muehleder.friedmanng.data;

public class GraveOwner {
	
	private String firstName;
	private String familyName;
	private String street;
	private int housenumber;
	private int postalCode;
	private String town;
	
	public void setFirstName(String name) {
		firstName = name;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFamilyName(String secondName) {
		familyName = secondName;
	}

	public String getFamilyName() {
		return familyName;
	}
	
	public void setStreetName(String streetName) {
		street = streetName;
	}
	
	public String getStreetName() {
		return street;
	}
	
	public void setHouseNumber(int streetNumber) {
		housenumber = streetNumber;
	}
	
	public int getHouseNumber() {
		return housenumber;
	}
	
	public void setPostalCode(int postCode) {
		postalCode = postCode;	
	}
	
	public int getPostalCode() {
		return postalCode;
	}
	
	public void setTown(String village) {
		town = village;
	}
	
	public String getTown() {
		return town;
	}
}

