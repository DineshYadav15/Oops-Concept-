import java.util.*;
class Slenearsearch
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the search elemnet");
		String c[]={"ravi","dinesh","gautam","minku"};
		String ch=s1.nextLine();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i].equals(ch))
			{
				System.out.println("Enter the search index position = " + i);
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("it is not found");
		}
	}
}


		
		
	