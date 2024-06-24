package javaInterviewProgram;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// i/p: My name is arpit   // a a e i i 
		// o/p: vowel =5  consosnt=8
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the String u want for vowel and Consonant");
		String name=sc.nextLine(); //length=16
		
		String str=name.trim();
		System.out.println(str);
		
		
		char ch[]=str.toCharArray();
		int vowel=0;
		int cons=0;
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				vowel=vowel+1;
			}else if(ch[i]>='a'&& ch[i]<='z') {
				cons=cons+1;
			}
			
		}
		
		System.out.println("Total Vowel is : "+vowel);
		System.out.println("Total Consonant  is : "+cons);
		
		

	}

}
