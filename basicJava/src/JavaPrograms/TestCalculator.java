package JavaPrograms;

public class TestCalculator {
	int a=20;
	int b=10;

	public static void main(String[] args) {
		TestCalculator tc1=new TestCalculator();
		tc1.subt();
		tc1.sum(50,80);

	}
	
	public void sum(int x, int y) {  // Parameter Method
		int z=x+y;
		System.out.println("Sum of two number is :"+z);
	}
	
	public void subt() { // Without Parameter
		int c=a-b;
		System.out.println("Subtract of two number is :"+c);
		
	}

}
