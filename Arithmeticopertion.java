import java.util.*;
class Arithmeticopertion
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter first  numbers : ");
		int num1=s1.nextInt();
		System.out.println("enter second number");
		int num2=s1.nextInt();
		int add,sub,multi,divide;
		add=num1+num2;			
		System.out.println("Add two numbers = " + add);
		sub=num1-num2;
		System.out.println("Sub two numbers = " + sub);
		multi=num1*num2;
		System.out.println("Multi two numbers = " + multi);
        divide=num1/num2;	
		System.out.println("Divide two numbers = " + divide);
		
		
		
	}

}

