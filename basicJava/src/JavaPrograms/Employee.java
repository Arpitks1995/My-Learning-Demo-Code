package JavaPrograms;

public class Employee {
	
	static String companyName; // Static Data Memeber
	static long hrMobileNumber; // We don't need to create object we can simply call the class name Employee
	
	String employeName;  // Non Static Data Member
	int mobileNumber;  // To Call or use this variable we have to create the Object
	
	public void printDetail() {
		System.out.println("Name of the Company: "+companyName);
		System.out.println("Phone Number of HR Company: "+hrMobileNumber);
		System.out.println("Name of the Employee: "+employeName);
		System.out.println("Mobile Nimber Of Employee: "+mobileNumber);
	}
	

}
