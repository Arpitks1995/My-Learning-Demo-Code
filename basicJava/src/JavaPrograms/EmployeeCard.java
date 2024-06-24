package JavaPrograms;

public class EmployeeCard {

	public static void main(String[] args) { // main method----------JVM
		Employee emp1=new Employee();
		emp1.employeName="Udit Garg";
		emp1.mobileNumber=123431;
		Employee.companyName="Biz2Credit";
		Employee.hrMobileNumber=786678;
		emp1.printDetail();
		
		System.out.println("***************************************");
		Employee emp2=new Employee();
		emp2.employeName="Rohit Jindal";
		emp2.mobileNumber=92193;
		emp2.printDetail();
	}

}
