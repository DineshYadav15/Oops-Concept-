import java.util.*;
class PrimeNumber
{
	public static void main (String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number");
		int number=s1.nextInt();
		int count=0;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("it is a prime number");
		}
		else
		{
			System.out.println("it is not prime number");
		}
	}
}