import java.util.*;
class NegativepositiveORzero
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter the any numbers");
		int num=s1.nextInt();
		if(num>=1)
		{
			System.out.print("it is positive number");
		}
		else if(num<=-1)
		{
			System.out.print("it is negative number");
		}
		else{
			System.out.print("it is zero");
		}
	}
}