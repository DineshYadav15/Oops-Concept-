import java.util.*;
class SumOfelEmentinArray
{
	public static void main(String[] args)
	{
		sum();
	}
	static void sum()
	{
		Scanner java=new Scanner(System.in);
		System.out.println("enter the number limit:");
		int num=java.nextInt();
		int number[]=new int[num];
		System.out.println("enter any number for digit:");
		for(int i=0;i<num;i++)
		{
		number[i]=java.nextInt();
		}
		int sum=0;
		for(int i=0;i<num;i++)
		{
			sum=sum+number[i];
		}
		System.out.println("sum of array of element = " + sum);
	}
}
	
	
		
