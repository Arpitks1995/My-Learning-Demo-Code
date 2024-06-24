package JavaPrograms;

public class ConstructorDemo {
	
	int id;   // Default value store will be zero
	String name; // default value will be null
	
	ConstructorDemo(){ // it is created by the compiler
		id=0;
		name=null;
		
	}


	public static void main(String[] args) {
		
		ConstructorDemo cd1=new ConstructorDemo(); // object Creation
		System.out.println(cd1.id);
		System.out.println(cd1.name);
	

	}

}
