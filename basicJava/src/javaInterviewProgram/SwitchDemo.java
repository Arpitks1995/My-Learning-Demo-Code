package javaInterviewProgram;

public class SwitchDemo {

	public static void main(String[] args) {
		System.out.println("Welcome To the ATM");
		int button=4;
		
		switch(button) {
		case 1: System.out.println("Withdraw");
		break;
		
		case 2: System.out.println("Balance Check");
		break;
		
		case 3: System.out.println("Mini Statement");
		break;
		
		default: System.out.println("Invalid Option you are choosing");
		
		}
		System.out.println("Thank You");

	}

}
