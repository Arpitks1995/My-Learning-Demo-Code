package JavaPrograms;

public class UserDefineConstructorDemo {
	int id;   
	String name;
	
	 UserDefineConstructorDemo(int i, String n){
		 id=i;
		 name=n;
		 
	 }
	
	public static void main(String[] args) {
		UserDefineConstructorDemo ud1=new UserDefineConstructorDemo(123,"Rohit");
		System.out.println(ud1.id);
		System.out.println(ud1.name);
		
		UserDefineConstructorDemo ud2=new UserDefineConstructorDemo(7238,"abhishek");
		System.out.println(ud2.id);
		System.out.println(ud2.name);
		
	}
	

}
