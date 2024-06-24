package JavaPrograms;

public class TestMethod {
	
	String dog;
	String men;

	public static void main(String[] args) { // Main Method
		
		TestMethod t1=new TestMethod(); // Object Creation
		t1.dog="pitbull";
		t1.men="Rahul Gandhi";
		t1.bark();
		t1.walk();
		
	}
	
	public void bark() {
		System.out.println("Dog is Barking whose name is "+dog);
		System.out.println("Dog is Barking whose name is " +dog+ " Eyes of Fear ");
	}
	
	public void walk() {
		System.out.println("men is walking whose name is "+men);  // + Sign meaning concatenation
	}
	

}
