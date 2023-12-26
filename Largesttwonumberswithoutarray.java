import java.util.*;
class Largesttwonumberswithoutarray
{
	/*
	public static void main(String args[])
	{
		int a=90;
		int b=34;
		if(a>b)
		{
			System.out.println("A is greater then B = " + a);
		}
		else
		{
			System.out.println("B is greater then A = " + b);
		}
	}
}*/
   public static void main(String args[])
   {
	   Scanner s1=new Scanner(System.in);
	   System.out.println("Enter the number of A");
	   int num1=s1.nextInt();
	   System.out.println("enter the number fo B");
	   int num2=s1.nextInt();
	   if(num1>num2)
	   {
		   System.out.println("A is greater then B = " + num1);
	   }
	   else{
		   System.out.println("B is greater then A = " + num2);
	   }
   }
}

	