import java.util.*;
class PrimenumberORnot
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the any number");
		int num=s1.nextInt();
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
			if(count==0)
			{
				System.out.println("it is  prime number");
			}else
			{
				System.out.println("it is not prime number");
			}
		
	}
}