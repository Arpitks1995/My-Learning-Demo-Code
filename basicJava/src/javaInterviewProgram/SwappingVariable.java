package javaInterviewProgram;

public class SwappingVariable {

	public static void main(String[] args) {
		 int a=10;
		 int b=20;
		 int c;
		 
		 System.out.println("Before Swapping value of a is : "+a);  //10
		 System.out.println("Before Swapping value of b is : "+b);  //20
		 c=a;  // c=10
		 a=b;   // a=20
		 b=c;    // b=10

		 System.out.println("After Swapping value of a is : "+a);  //20
		 System.out.println("After Swapping value of b is : "+b);   // 10
	}

}
