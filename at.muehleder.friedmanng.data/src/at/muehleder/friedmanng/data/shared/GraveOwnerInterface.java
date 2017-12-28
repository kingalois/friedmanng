package at.muehleder.friedmanng.data.shared;

public interface GraveOwnerInterface {
	
		public void setFirstName(String name);
		
		public String getFirstName();

		public void setFamilyName(String secondName);

		public String getFamilyName();

		public void setStreetName(String streetName);
		
		public String getStreetName();
		
		public void setHouseNumber(int streetNumber);
		
		public int getHouseNumber();
		
		public void setPostalCode(int postCode);
		
		public int getPostalCode();
		
		public void setTown(String village);
		
		public String getTown();

}
