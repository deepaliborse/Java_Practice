class Defaults
{
	
	static int k;
	static double d;
	static float f;
	static boolean istrue;
	static String p;
	static char c;

	public static void main(String args[]) 
	{
		Defaults obj = new Defaults();

		System.out.println("static int default value = "+ k);
		System.out.println("static char default value = "+ c);
		System.out.println("static double default value = "+ d);
		System.out.println("static float default value = "+ f);
		System.out.println("static boolean default value = "+ istrue);
		System.out.println("static String default value = "+ p);

		System.out.println("Instance int varible value = "+ obj.k);
		System.out.println("Instance char varible value = "+ obj.c);
		System.out.println("Instance double varible value = "+ obj.d);
		System.out.println("Instance float varible value = "+ obj.f);
		System.out.println("Instance boolean varible value = "+ obj.istrue);
		System.out.println("Instance String varible value = "+ obj.p);
	}
}

