package at.muehleder.friedmanng.data;

public class DiedPerson {
		
	private String firstName;
	private String familyname;
	private String adress;
	private int houseNumber;
	private int postalcode;
	private String town;
	private String dayOfDeath;
	private String funeralday;
	
	public void setFirstName(String nameFirst ) {
		firstName = nameFirst;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFamilyName(String nameSecond) {
		familyname = nameSecond;
	}
	
	public String getFamilyName() {
		return familyname;
	}
	
	public void setAdress(String adressName) {
		adress = adressName;
	}
	public String getAdress() {
		return adress;
	}

	public void setHouseNumber(int streetNumber) {
		houseNumber = streetNumber;
	}
	
	public int getHouseNumber() {
		return houseNumber;
	}

	public void setPostalCode(int postcode) {
		postalcode = postcode;
	}
	
	public int getPostalCode(){
		return postalcode;
	}

	public void setTown(String village) {
		town = village;
	}
	
	public String getTown() {
		return town;
	}
	
	public void setDayOfDeath(String deathDay) {
		dayOfDeath = deathDay;
	}
	
	public String getDayOfDeath() {
		return dayOfDeath;
	}
	
	public void setFuneralday(String dayOfFuneral) {
		funeralday = dayOfFuneral;
	}
	
	public String getFuneralday(){
		return funeralday;
	}

}
