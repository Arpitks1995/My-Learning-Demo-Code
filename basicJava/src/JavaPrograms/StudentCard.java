package JavaPrograms;

public class StudentCard {

	public static void main(String[] args) {  // Main Method
		
		Student st1=new Student(); // New Object is created 
		
		
		
		st1.name="Nikunj";
		st1.id=786;
		st1.printCard();
		
		
		Student st2=new Student();
		
		st2.name="Rohit";
		st2.id=788;
		System.out.println("*********************************************************************");
		st2.printCard();
		
		
		Student backbencher=new Student();
		backbencher.name="Abhishek";
		backbencher.id=123321;
		backbencher.printCard();
		
	}

}
