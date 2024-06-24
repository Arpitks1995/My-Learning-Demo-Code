package JavaPrograms;

public class BanKManager {
	
	static String managerName;// Static Data memeber
	 String itteam;  // Non Static DataMemeber
	
	static void createAccount() {
		System.out.println(" Account created by BankManager "+managerName);
		//System.out.println("Name of the Person In IT Team is "+itteam); // Only static Data memeber will be allow
	}

}
