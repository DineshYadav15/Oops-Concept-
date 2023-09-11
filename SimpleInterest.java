import java.util.*;
class SimpleInterest
{
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the principle : ");
		int p=s1.nextInt();
		
		System.out.println("enter the rate : ");
		int r=s1.nextInt();
		System.out.println("enter the time : ");
		int t=s1.nextInt();
		int si;
		si=p*r*t/100;
		System.out.println("Simple Interest is = " +si);
		
	}

}