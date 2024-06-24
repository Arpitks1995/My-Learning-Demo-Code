package JavaPrograms;

public class TestBankCustomer {

	public static void main(String[] args) {
		BanKManager.managerName="Udit Garg";
		BanKManager.createAccount();
		
		Customer c1=new Customer();
		c1.name="Arpit";
		c1.accountNo=123321;
		c1.withdraw();
		 
		
		Customer c2=new Customer();
		c2.name="Nikunj";
		c2.accountNo=12928;
		c2.withdraw();

	}

}
