package test;

public class Casting {
	static int a = 5;
	static double c = 10.5;
	static double r = 8.5;
	static double u = 15.6;
	static String q = "2";
	static String w = "3";
	static String name = "Abdulhamid";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("integer : "+ a );
		System.out.println("double : "+ c );
		System.out.println("double : "+ r );
		int d = (int)c;
		System.out.println("change to integer : "+ d );
		double b = (double)a;
		System.out.println("change to Double : "+ b );
		
		String e = String.valueOf(r);
		System.out.println("change c to String : "+ e );
		
		String i = new Double(u).toString();
		System.out.println("change u to String : "+ i );
		//System.out.println(e.toString(r));
		
		int qq = Integer.parseInt(q);
		int ww = Integer.parseInt(w);
		int ans = qq + ww;
		System.out.println("my Answr from String = "+ ans );
		
		System.out.println("my name: "+ name );



	}

}
