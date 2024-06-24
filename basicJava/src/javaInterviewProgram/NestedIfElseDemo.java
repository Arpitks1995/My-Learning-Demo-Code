package javaInterviewProgram;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		System.out.println("Welocme To THe ATM");
		
		int pin=1234;
		
		if(pin==1234) { // Outer Condition
			
			System.out.println("Enter the Amount");
			int amt=25000;
			
			if(amt<=20000) {    // inner condition
				System.out.println("Money is Successfully Withdraw");
			}else {
				System.out.println("Insufficint Balance");
			}
			
		}else {
			System.out.println("Invalid Pin sorry Try again later");
		}

	}

}
