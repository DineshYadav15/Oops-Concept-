import java.util.*;
class sum
{
	public static void main(String arga[])
	{
		sum();
		sum();
	}
	static void sum()
	{
		Scanner s1=new Scanner (System.in);
		System.out.print("enter first number number:");
		int num1=s1.nextInt();
		System.out.println();
		System.out.print("enter second number:");
		int num2= s1.nextInt();
		int sum=num1+num2;
		System.out.println("sum of digits = " + sum);
	}
}

