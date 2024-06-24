package JavaPrograms;

public class TestNameMain {

	public static void main(String[] args) {
		TestName.printName();
		int phoneNumber=TestName.getNumber();
		System.out.println("Recevied Number :"+phoneNumber);
		
		int[] arrs=TestName.getNumbers();
		
		for(int i=0;i<arrs.length;i++) {   //i<5
			System.out.println(arrs[i]);
		}

	}

}
