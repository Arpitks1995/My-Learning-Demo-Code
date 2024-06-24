package JavaPrograms;

public class TestCompileTimePolymorphism {

public void print() {
	System.out.println("Hello World I am Java");
}


public void print(String name) {
	System.out.println("Print only String"+name);
}


public void print(int i) {
	System.out.println("Print only integer"+i);
}



public void print(int i, String str) {
	System.out.println("Print only integer "+i+ " Another String name "+str);
}



}
