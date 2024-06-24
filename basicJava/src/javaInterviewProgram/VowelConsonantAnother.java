package javaInterviewProgram;

import java.util.Scanner;

public class VowelConsonantAnother {

	public static void main(String[] args) {
		// i/p: My name is arpit   // a  e i o u ( a e i a i) vowel =5 ( length=16 )
		// o/p: vowel =5  consosnt=8
		
		
		
		String str="my name is arpit";
		System.out.println(str);
		str=str.replaceAll("\\s", "");  //(It is used for removing the unwanted space)
		System.out.println(str);
		
		
		char ch[]=str.toCharArray();
		int vowel=0;
		int cons=0;
		
		for(int i=0;i<ch.length;i++) { //  0<16
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				vowel=vowel+1;
			}else  {
				cons=cons+1;
			}
			
		}
		
		System.out.println("Total Vowel is : "+vowel);
		System.out.println("Total Consonant  is : "+cons);
		
		

	}

}
