package methodsJava;

public class Methodoverriding {
	
	
	public  void methodoverriding() {
		
		System.out.println("method overriding is called");
	}
	
	static class  Methodoverriding2 extends Methodoverriding{
		
		public   void methodoverriding() {
			
			System.out.println("overriding the same method ");
			
		}
	}
	
	
	public static void main(String[] args) {
		
		Methodoverriding2 mh = new Methodoverriding2();
		
		mh.methodoverriding();
		
		Methodoverriding mj= new Methodoverriding();
		
		mj.methodoverriding();
	}

}
