import java.util.*;
class SwipeTwoNO
{
	/*
	public static void main(String args[])
	{
		int a=20;
		int b=30;
		int temp;
		temp=a;
		a=b;
		b=temp;
	    
			System.out.println("A swaipe B numbers = " + a);
			System.out.println("B swaipe A numbers = " + b);
	}
}*/
     public static void main(String args[])
	{ 
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the number of A");
	int num1=s1.nextInt();
	System.out.println("enter the number of B");
	int num2=s1.nextInt();
	int temp;
	temp=num1;
	num1=num2;
	num2=temp;
	System.out.println("num1 Swapping num2 number = " +num1);
	System.out.println("num2 Swapping num1 number = " +num2);
	}
}
	
	
	
		
		