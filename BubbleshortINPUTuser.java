import java.util.*;
class BubbleshortINPUTuser
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Eenter the limit number");
		int num=s1.nextInt();
		int number[]=new int[num];
		System.out.println("Eenter the number");
		for(int i=0;i<num;i++)
		{
			number[i]=s1.nextInt();
		}
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num-1-i;j++)
			{
				if(number[j]>number[j+1])
				{
					int temp=number[j];
				    number[j]=number[j+1];
				    number[j+1]=temp;
				}
			}
		}
		System.out.println("sorted the number");
		for(int i=0;i<num;i++)
		{
			System.out.print("\t"+number[i]);
		}
	}
}
			
		
		
		