package JavaPrograms;

public class UserTest {

	private String name="Modi ji";
	private String password="Amit@1234";
	private int age=68;
	
	public String getName() {   // getter Method (It simply display the value)
		System.out.println("Access name");
		return name;
	}
	
	public String getPassword() {   // getter Method
		System.out.println("Access password");
		return password;
	}
	
	public int getAge() {   // getter Method
		System.out.println("Access Age");
		return age;
	}
	
	
	public void setName(String name) {    //setter Method (In Setter Methiod We change the Value
		System.out.println("Name Changed");
		this.name=name;
	}
	
	public void setPassword(String password) {
		System.out.println("Password Changed");
		this.password=password;
	}
	
	
	public void setAge(int age) {
		System.out.println("Age Changed");
		this.age=age;
	}
	
	
	
	
}
