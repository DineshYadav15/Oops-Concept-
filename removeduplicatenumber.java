import java.util.*;
class removeduplicatenumber
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("enter  numbers : ");
		int num=s1.nextInt();
	    //int number[]=new int[num];
		//System.out.print("enter  numbers : ");
		//for(int i=0;i<num;i++)
		//{
		//	number[i]=s1.nextInt();
		//}
		int i=0;
		for(int j=1;j<num;j++)
		{
			if(number[i]!=number[j])
			{
				number[i+1]=number[j];
				i++;
	
			}
			System.out.println(i+1);
		}
	}
}
	
		