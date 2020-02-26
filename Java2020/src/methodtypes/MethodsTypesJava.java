package methodtypes;

public class MethodsTypesJava {
	
	public static void Methodoverloading() {
		
		System.out.println("this is methodoverloading 1");
	}
	
public static void Methodoverloading(int a) {
		
		System.out.println("this is methodoverloading 2");
		
		System.out.println(a);
		
		System.out.println("calling the 1st above method");
		
		Methodoverloading();
	}


public static void main(String[] args) {
		
	Methodoverloading();
	
	Methodoverloading(45);
}
}
