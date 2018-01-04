package at.muehleder.friedmanng.data.shared.interfaces;

public interface DiedPersonInterface extends PersonInterface {
	
	public int getAge();

	public long getDeathday();

	public long getDayOfInterment();

	public void setAge(int age);

	public void setDeathday(long deathday);

	public void setDayOfInterment(long dayOfInterment);
	
	public GraveInterface getGrave();
	
	public void setGrave(GraveInterface grave);
	
	public void setInternalPosition(InternalGravePositionInterface internalPos);
	
	public InternalGravePositionInterface getInternalPosition();
}
