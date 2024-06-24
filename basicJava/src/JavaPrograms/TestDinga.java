package JavaPrograms;

public class TestDinga {

	public static void main(String[] args) {
		//Dinga d1=new Dinga(); Because we can't develop constructor that why we can't create any object
		//Dinga.m1();  //Because Abstract method are non static in nature
		
		Dinga d1=new Linga(); //Refrence variable
		d1.m1();
		d1.m2();
		

	}

}
