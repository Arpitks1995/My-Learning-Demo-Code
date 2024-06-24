package JavaPrograms;

public class EncapsulatedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserTest u1=new UserTest();
		
		System.out.println(u1.getName());
	    System.out.println(u1.getPassword());
		System.out.println(u1.getAge());
		
		System.out.println("*********************************************************");
		
		u1.setName("Rahul Gandhi");
		u1.setPassword("Soniya@12345");
		u1.setAge(45);
		
		System.out.println(u1.getName());
		System.out.println(u1.getPassword());
    	System.out.println(u1.getAge());
	}

}
