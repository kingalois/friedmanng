package at.muehleder.friedmanng.data;

import java.util.UUID;

import at.muehleder.friedmanng.data.shared.interfaces.DiedPersonInterface;
import at.muehleder.friedmanng.data.shared.interfaces.GraveInterface;
import at.muehleder.friedmanng.data.shared.interfaces.InternalGravePositionInterface;

public class DiedPerson extends AbstractPerson implements DiedPersonInterface {
	
	private long deathday;
	private long dayOfInterment;
	private int age;
	private GraveInterface grave;
	private InternalGravePositionInterface internalPos;
	

	public DiedPerson(UUID uuid) {
		super(uuid);
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public long getDeathday() {
		return deathday;
	}

	@Override
	public long getDayOfInterment() {
		return dayOfInterment;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
		
	}

	@Override
	public void setDeathday(long deathday) {
		this.deathday = deathday;
	}

	@Override
	public void setDayOfInterment(long dayOfInterment) {
		this.dayOfInterment = dayOfInterment;
	}

	@Override
	public GraveInterface getGrave() {
		return grave;
	}

	@Override
	public void setGrave(GraveInterface grave) {
		this.grave = grave;
	}

	@Override
	public void setInternalPosition(InternalGravePositionInterface internalPos) {
		this.internalPos = internalPos;
	}

	@Override
	public InternalGravePositionInterface getInternalPosition() {
		return internalPos;
	}
		

}
