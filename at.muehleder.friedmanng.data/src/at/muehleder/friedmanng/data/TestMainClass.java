package at.muehleder.friedmanng.data;

public class TestMainClass {

	public static void main(String[] args) {
		GraveOwner owner = new GraveOwner();
		owner.setFirstName("Jonas");
		
		GraveOwner ownerFlo = new GraveOwner();
		ownerFlo.setFirstName("Flo");
		
		System.out.println(owner.getFirstName());

	}

}
