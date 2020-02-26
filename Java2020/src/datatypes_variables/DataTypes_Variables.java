package datatypes_variables;

public class DataTypes_Variables {
	
	static int a;
	static float b;
	static long c;
	static short d;
	static double e;
	static char f;
	static String g;
	static boolean h;
	
	int i;
	float j;
	long k;
	short l;
	double m;
	char n;
	String o;
	boolean p;
	
	public static void main(String[] args) {
		
		int q = 0;
		float r = 0;
		long s = 0;
		short t = 0;
		double u = 0;
		char v = 0;
		String w = null;
		boolean x = false;
		
		System.out.println("the value of local variable\t"+q);
		System.out.println("the value of local variable\t"+r);

		System.out.println("the value of local variable\t"+s);

		System.out.println("the value of local variable\t"+t);

		System.out.println("the value of local variable\t"+u);

		System.out.println("the value of local variable\t"+v);

		System.out.println("the value of local variable\t"+w);

		System.out.println("the value of local variable\t"+x);
		
		
		DataTypes_Variables dv = new DataTypes_Variables();
		System.out.println("the value of instance/ non static variable\t"+dv.i);
		System.out.println("the value of instance/ non static variable\t"+dv.j);

		System.out.println("the value of instance/ non static variable\t"+dv.k);

		System.out.println("the value of instance/ non static variable\t"+dv.l);

		System.out.println("the value of instance/ non static variable\t"+dv.m);

		System.out.println("the value of instance/ non static variable\t"+dv.n);

		System.out.println("the value of instance/ non static variable\t"+dv.o);

		System.out.println("the value of instance/ non static variable\t"+dv.p);
		
		
		System.out.println("the value of  static variable\t"+a);
		System.out.println("the value of  static variable\t"+b);
		System.out.println("the value of  static variable\t"+c);
		System.out.println("the value of  static variable\t"+d);
		System.out.println("the value of  static variable\t"+e);
		System.out.println("the value of  static variable\t"+f);
		System.out.println("the value of  static variable\t"+g);
		System.out.println("the value of  static variable\t"+h);

	}

}
