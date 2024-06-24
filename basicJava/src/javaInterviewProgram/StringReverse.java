package javaInterviewProgram;

public class StringReverse {

	public static void main(String[] args) {
		// I/p: udit garg
		//O/p: grag tidu
		
		String name="arpit raghuvanshi"; 
		String rev=" ";
		char ch[]=name.toCharArray();   // Length =9
		
		for(int i=ch.length-1;i>=0;i--) {  // 9-1=8    8>=0     8-1=7  7>=0 6>=0    0>=0
			
			rev=rev+ch[i];     //  " "+ch[8]     rev=g	  rev=g+ch[7]	rev=gr	  rev=gr+ch[6] rev=gra
		}
		
		System.out.println("Reverse of the String is : "+rev);

	}

}
