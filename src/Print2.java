
public class Print2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		for(int i = 1; i < 9; i++)
		{
			for(int j = 9; j > 1; j--)
			{
				if(i < j)
					System.out.print(" ");
				else
				{
					System.out.print(i-j+1);
					//System.out.print(i);
				}
			}
			System.out.println();
		}
	}
}
