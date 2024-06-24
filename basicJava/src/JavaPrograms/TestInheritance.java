package JavaPrograms;

public class TestInheritance {

	public static void main(String[] args) {
		
//	PowerEngine ps1=new PowerEngine();
//	ps1.name="Ambesador car";
//	ps1.hostpower=2000;
//	
//	ps1.start();
//	
//	ps1.speed();
		
		
		TurboPowerEngine tb1=new TurboPowerEngine();
		
		tb1.name="Tarzan Car";
		tb1.start();
		tb1.hostpower=2000;
		tb1.race=200;
		tb1.speed();
		
	
	}

}
