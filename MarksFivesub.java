import java.util.*;
class MarksFivesub
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter subjects  Marks : ");
		
		System.out.println("enter Maths Marks : ");
		int num1=s1.nextInt();
		System.out.println("enter English  Marks : ");
		int num2=s1.nextInt();
		System.out.println("enter java  Marks : ");
		int num3=s1.nextInt();
		System.out.println("enter science  Marks : ");
		int num4=s1.nextInt();
		System.out.println("enter hindi  Marks : ");
		int num5=s1.nextInt();
		int totalmarks;
		totalmarks=num1+num2+num3+num4+num5;
		float avg;
		avg=totalmarks/5;
		System.out.println("All five subject totalmarks = " + totalmarks);
		System.out.println("All five subject average = " + avg);
	}

}
