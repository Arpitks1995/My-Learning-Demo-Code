package javaInterviewProgram;

public class ReverseStringSecondWay {

	public static void main(String[] args) {
		// I/p: udit garg
		//O/p: grag tidu
				
				String name="udit garg";  // Total Length=9
				String rev=" ";
			
				for(int i=name.length()-1;i>=0;i--) { // i=9-1=8  8>=0   8-1=7 7>=0
					rev=rev+name.charAt(i);       // rev=""+g= rev=g   rev=g=name.charAt[7]= g+r=gr
				}
				
				System.out.println(rev);

	}

}
