import java.util.*;
class factorial
{
	public static void main(String args[])
	{
		
	   Scanner s1=new Scanner(System.in);
	   System.out.println("enter the numbers");
	   int num=s1.nextInt();
	   int fact=1;
	   int r;
	   for(int i=1;i<=num;i++)
	   { 
           
		   fact=fact*i;
	   }
	   System.out.println("factoial " +fact);
	}
}