package JavaPrograms;

public class TestMethodOverloading {
	
	static void print(int num) {
		System.out.println("Printing a Number "+num);
	}
	
	static void print(int num1, int num2) {
		System.out.println("Printing two Numbwer "+num1+ "Second number is :"+num2);
	}
	
	static void print(String name) {
		System.out.println("Printing a name "+name);
	}
	
	static void print(char c) {
		System.out.println("Printing a character "+c);
	}
	
	

}
