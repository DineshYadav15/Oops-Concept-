import java.util.*;
public class SwapeTWOnumbers {
    public static void main(String[] args) {
    	
		Scanner s1=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=s1.nextInt();
		System.out.println("enter second number");
		int num2=s1.nextInt();
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping: a= " + num1);
		System.out.println("After swapping: b= " + num2);
				
    }
}
