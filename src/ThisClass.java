
public class ThisClass {

	int a=10;
	int b=22;
	static void display()
	{
		int c=12;
		int b=23;
		int a=30;
		System.out.println(a+" "+b);
	}
	void display2()
	{
		int a=45;
		b=67;
		System.out.println(this.a+" "+b);	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisClass thisObj=new ThisClass();
			
		ThisClass.display();
		thisObj.display2();
		
		System.out.println(thisObj.a+" "+thisObj.b);
	}

}
