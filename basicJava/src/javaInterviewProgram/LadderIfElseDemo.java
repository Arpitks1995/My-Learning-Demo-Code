package javaInterviewProgram;

public class LadderIfElseDemo {

	public static void main(String[] args) {
		System.out.println("Welcome to the Result Of Grade System Of Graduation");
		int marks=99;
		if(marks>=33 && marks<40) {
			System.out.println("You are Pass with Grade C");
		}else if(marks>=40 && marks<60) {  
			
			System.out.println("You are Pass with Grade B");
		}else if(marks>=60 && marks<80) { //65>60  65<80
			System.out.println("You are Pass with Grade A");
		}else if(marks>=80 && marks<=100) {
			System.out.println("You are Pass with Grade A +");
		}else {
			System.out.println("You are Failed Padai Karo");
		}

	}

}
