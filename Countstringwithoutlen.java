import java.util.Scanner;
class Countstringwithoutlen
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter char");
		String str=s1.nextLine();
		
		//String charString="qwerttfdssdd";
		int count=0;
		 for (char c : str.toCharArray())
		{
			count++;
			
		}
		System.out.println("count char = " + count);
	}
}