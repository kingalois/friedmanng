package at.muehleder.friedmanng.exercises;

public class MainClass {

	public static void main(String[] args) {
		String name = "jonas";
		String otherName = "Jonas";
		
		if(name.equals(otherName)) {
			System.out.println("the names are equal");
		}
		
		CarList list = new CarList();
		
		Car jonasCar = new Car();
		jonasCar.setName("Audi R8");
		jonasCar.setOwnername("Jonas");
		jonasCar.setNumberBoard("UU-COOL1");
		
		Car floCar = new Car();
		floCar.setName("VW Käfer");
		floCar.setOwnername("Flo");
		floCar.setNumberBoard("UU-COOL1");
		
		Car aloisCar = new Car();
		aloisCar.setName("Ford");
		aloisCar.setOwnername("Alois");
		aloisCar.setNumberBoard("UU-COOL1");
		
		list.add(jonasCar);
		list.add(floCar);
		list.add(aloisCar);
		list.delete(floCar);
		list.print();
		
		

	}

}
