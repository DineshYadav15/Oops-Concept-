import java.util.*;
class LOWERcaseUPPERcase
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the any numbers");
		char ch=s1.nextLine().charAt(0);
		if(ch>='A'&&ch<='Z')
		{
			
			System.out.println("it is Upper Case");
		}
		else if(ch>='a'&&ch<='z')
		{
			System.out.println("it is Lower Case");
		}
		else{
			System.out.println("it is infinite");
		}
			
	}
}