package javaInterviewProgram;

public class BubbleSort {

	public static void main(String[] args) {
	//	i/p= {30,50,10,60,20}
	// o/p= {10,20,30,50,60}
		
		int arr[]= {30,50,10,60,20,70};    // 10,50,30,60,20,70
		int temp;
		System.out.println("Value of array before Logic");
		
		for(int a=0;a<arr.length;a++) {
			System.out.print(arr[a]+ " ");
		}
		
		for(int i=0;i<arr.length;i++) {   // 0<6    1<6
			
			for(int j=i+1;j<arr.length;j++) {  // j=0+1 j=1    1<6    j=1+1=2   2<6  J=2+1=3  3<6  4  4<6  5<6
				                               // j=1+1 j=2    2<6
				
				if(arr[i]>arr[j]) {  // arr[0]>arr[1]    // 30>50  arr[0] >arr[2]  30>10   arr[0]>arr[3] 10>60  10 >20  10>70
					temp=arr[i];     // temp=30
					arr[i]=arr[j];   // arr[i]=10
					arr[j]=temp;     // arr[j]=30
					
				}
			}
		}
		System.out.println();
		System.out.println("Value of array after the logic");
		for(int a=0;a<arr.length;a++) {
			System.out.print(arr[a]+ " ");
		}
		

	}

}
