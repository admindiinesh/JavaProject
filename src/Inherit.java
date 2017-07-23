class Cone
{
	Cone()
	{
		System.out.println("C 1");
	}
}
class Ctwo extends Cone
{
	Ctwo()
	{
		System.out.println("C 2");
	}
}
class Cthree extends Ctwo
{
	Cthree()
	{
		System.out.println("C 3");
	}
}
public class Inherit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cthree c3=new Cthree();
	}

}
