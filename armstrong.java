import java.util.*;
class armstrong
{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
		int num=s1.nextInt();
		int t1=num;
		int len=0;
		while(t1!=0)
		{
			t1=t1/10;
			len=len+1;
		}
		int t2=num;
		int sum=0;
		int r;
		while(t2>0)
		{
			int ans=1;
			 r=t2%10;
		    
			for(int i=1;i<=len;i++)
			{
				ans=ans*r;
			
			}
			sum=sum+ans;
			t2=t2/10;
		}
		if(num==sum)
		{
			System.out.println("it is armstrong number");
		}
		else
		{
			System.out.println("it is not armstrong number");
		}
	}
}
		