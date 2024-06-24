package javaInterviewProgram;

public class SwappingVariableWithoutThirdVariable {

	public static void main(String[] args) {
		 int a=10;
		 int b=20;
		 
		 System.out.println("Before Swapping value of a is : "+a);  //10
		 System.out.println("Before Swapping value of b is : "+b);  //20
		 
		 a=a+b; // a=30
		 b=a-b; // b=30-20=10  b=10
		 a=a-b;  // a=30-10 =20  a=20
		 
		 System.out.println("After Swapping value of a is : "+a);  //20
		 System.out.println("After Swapping value of b is : "+b);  //10

	}

}
