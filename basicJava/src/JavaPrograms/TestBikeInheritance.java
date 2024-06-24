package JavaPrograms;

public class TestBikeInheritance {

	public static void main(String[] args) {
		SportBike sb1=new SportBike();
		
		sb1.names="Bajaj Pulsar 1990s";
		sb1.name="pulsar 150 DTS";
		sb1.colour="All Black";
	
		sb1.start();
	
		
		
		sb1.speed();
		
		System.out.println("***********************************************************************");
		
		CruzeBike cb1=new CruzeBike();
		cb1.company="Honda";
		cb1.featureBike();
		cb1.names="Hero Honda";
		cb1.start();


	}

}
