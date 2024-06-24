package javaInterviewProgram;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("Without swapping value of a "+a);
		System.out.println("Without swapping value of b "+b);
		
		a=a+b;  //10+20=30
		b=a-b;  // 30-20=10
		a=a-b; // 30-10=20

		System.out.println("After swapping value of a "+a);
		System.out.println("After swapping value of b "+b);
	}

}
