import java.util.*;
class SwapingTWOnumbers
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the A : ");
		int a=s1.nextInt();
		System.out.println("enter the B : ");
		int b=s1.nextInt();
        int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("A Swapping B numbers " + a);
		System.out.println("B Swapping A numbers " + b);
		
	}

}
