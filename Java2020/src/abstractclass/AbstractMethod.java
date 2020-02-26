package abstractclass;

public abstract class AbstractMethod {
	
	 abstract   void bike();
	 
	 public static void Yo() {
		 System.out.println("this is Yo Method");
	 }


}
	class abstractMethodCall extends AbstractMethod {
		 
	void bike() {

			System.out.println("this is bike abtract ");
		}
	 
	 
	 
	 
	 public static void main(String[] args) {
		 
		 abstractMethodCall amc = new abstractMethodCall();
		 amc.bike();
		 
	 }	 
		 
		 
		 
		 
		 
		
	}
	


