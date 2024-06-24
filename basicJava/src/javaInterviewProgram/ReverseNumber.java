package javaInterviewProgram;

public class ReverseNumber {
	
	// I/p: 456
	//O/p: 654

	public static void main(String[] args) {
		int num=456;
		int temp,rev ;
		int sum=0;
		temp=num;
		
		while(num>0) { //45>0   4>0           0>0  
		rev=num%10;        // 456%10 =6                    45%10=5       4%10  =4
		sum=(sum*10)+rev;  //Sum=(0*10)+6=0+6=6           sum=(6*10)+5= 65    sum=(65*10)+4=654
		num=num/10;        // 456/10=45.6  num=45           45/10=4.5             4/10=0.4
			
		}
		
		System.out.println("Reverse of the Number is :"+sum);
		
		
		

	}

}
