package methodsJava;

public class MethodsJava {
	
	
public static void staticMethodswithoutReturnType2(){
		
		System.out.println("calling 1st staticMethodswithoutReturnType");
		
	}

public static void staticMethodswithoutReturnType(){
	
	System.out.println("calling 2nd staticMethodswithoutReturnType");
	
	staticMethodswithoutReturnType2();
}

public void  NonstaticMethodswithoutReturnType2(){
	
	System.out.println("calling 1st non- staticMethodswithoutReturnType");
	
}
public void  NonstaticMethodswithoutReturnType(){
	
	System.out.println("calling 2nd non staticMethodswithoutReturnType");
	
	NonstaticMethodswithoutReturnType2();
	
}

	
	public static void main(String[] args) {
		
		staticMethodswithoutReturnType();
		
		staticMethodswithoutReturnType2();
		
		MethodsJava mj = new MethodsJava();
		
		mj.NonstaticMethodswithoutReturnType();
		mj.NonstaticMethodswithoutReturnType2();
		
	}
}
