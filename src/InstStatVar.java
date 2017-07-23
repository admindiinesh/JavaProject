
public class InstStatVar {
	
	int i=10;
	
	static int s=20;
	
	void m1()
	{
		System.out.println(i);
		System.out.println(s);		
	}
	
	static void m2()
	{
		InstStatVar obj=new InstStatVar();
		System.out.println(obj.i);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InstStatVar obj=new InstStatVar();
		InstStatVar.m2();
		obj.m1();
		// TODO Auto-generated method stub

	}

}
