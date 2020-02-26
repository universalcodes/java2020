package interfaceJava;

public interface InterFaceJava {
	
	public abstract void car();
	
	public  abstract int carnum();
	
	public static  int intab () {
		
		return 67;
		
	}
		class InterfaceJava2 implements InterFaceJava{

			@Override
			public void car() {
				
				System.out.println("Car number");
			}

			@Override
			public int carnum() {


				return 0;
			}
			
			
			
		}
	

}
