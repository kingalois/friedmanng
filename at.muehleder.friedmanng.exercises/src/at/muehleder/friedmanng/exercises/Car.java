package at.muehleder.friedmanng.exercises;

public class Car {
	
	private String name;
	private String ownername;
	private String numberBoard;
	private Car next;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getNumberBoard() {
		return numberBoard;
	}
	public void setNumberBoard(String numberBoard) {
		this.numberBoard = numberBoard;
	}
	public Car getNext() {
		return next;
	}
	public void setNext(Car next) {
		this.next = next;
	}
	

	
}
