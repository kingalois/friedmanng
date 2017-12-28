package at.muehleder.friedmanng.data;

public class DiedPerson {
	
	
	private String firstName;
	
	public void setFirstName(String nameFirst ) {
		firstName = nameFirst;
	}
	
	public String getFirstName() {
		return firstName;
	}
	

	private String familyname;
	
	public void setFamilyName(String nameSecond) {
		familyname = nameSecond;
	}
	
	public String getFamilyName() {
		return familyname;
	}
	
	
	private String adress;
	
	public void setAdress(String adressName) {
		adress = adressName;
	}
	public String getAdress() {
		return adress;
	}
	
	
	private int houseNumber;
	
	public void setHouseNumber(int streetNumber) {
		houseNumber = streetNumber;
	}
	
	public int getHouseNumber() {
		return houseNumber;
	}
	
	
	private int postalcode;
	
	public void setPostalCode(int postcode) {
		postalcode = postcode;
	}
	
	public int getPostalCode(){
		return postalcode;
	}
	
		
	private String town;
	
	public void setTown(String village) {
		town = village;
	}
	
	public String getTown() {
		return town;
	}
	
	
	private String dayOfDeath;
	
	public void setDayOfDeath(String deathDay) {
		dayOfDeath = deathDay;
	}
	
	public String getDayOfDeath() {
		return dayOfDeath;
	}
	
	
	private String funeralday;
	
	public void setFuneralday(String dayOfFuneral) {
		funeralday = dayOfFuneral;
	}
	
	public String getFuneralday(){
		return funeralday;
	}

}
