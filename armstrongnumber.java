import java.util.*;
class Armstrongnumber
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the any numbers");
		int num =s1.nextInt();
		int r;
		int sum=0;
		int s=num;
		while(num>0);
		{
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
		if(s==r)
		{
			System.out.println("true");
			
		}
		else
		{
			System.out.println("true");
		}
	}
}
			
