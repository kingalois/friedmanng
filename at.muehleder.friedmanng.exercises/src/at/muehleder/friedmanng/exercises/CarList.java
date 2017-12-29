package at.muehleder.friedmanng.exercises;

public class CarList {
	
	private Car first;
	
	public void add(Car car) {
		if(first == null) { //if no car in list
			first = car;
			return;
		}
		Car temp = first;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(car);
		
		
	}

	public void delete(Car car) {
		
	}
	
	public Car getCarByOwner(String owner) {
		return null;
	}
	
	
	
	public void print() {
		if(first == null) {
			return;
		}
		Car temp = first;
		while(temp.getNext() != null) {
			System.out.println(temp.getName());
			temp = temp.getNext();
		}
		System.out.println(temp.getName());
	}

}
