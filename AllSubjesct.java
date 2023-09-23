import java.util.*;
class AllSubjesct
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Computer Marks");
		int num1=s1.nextInt();
		System.out.println("Maths  marks");
		int num2=s1.nextInt();
		System.out.println("physics  marks" );
		int num3=s1.nextInt();
		System.out.println("chemistry marks");
		int num4=s1.nextInt();
		System.out.println("biology  marks");
		int num5=s1.nextInt();
		float Totalmarks;
		Totalmarks=num1+num2+num3+num4+num5;
		float percentage;
		percentage=(Totalmarks/500)*100;
		System.out.println("Totalmarks of all subject   " + Totalmarks);
		System.out.println("percentage of all subject   " + percentage);
		char grade;
		if(percentage>=90)
		{
			grade='A';
		}
		else if(percentage>=80)
		{
			grade='B';
		}
		else if(percentage>=70)
		{
			grade='C';
		}
		else if(percentage>=60)
		{
			grade='D';
		}
		else if(percentage>=40)
		{
			grade='E';
		}else
		{
			grade='F';
		}
		System.out.println("percentage " + percentage + "%");
		System.out.println("grade " + grade);
		
	}
	
}
		
		
		
	