//write a program to it is even or odd number using constructer
//import java.util.*;
class test2
{
	int num;
	public test2(int num)
	{
		this.num=num;
	}
	 void display()
	 {
		 if(num%2==0)
		 {
			 System.out.println("it is even number");
		 }
		 else
		 {
			 System.out.println("it is odd number");
		 }
	 }
	 public static void main(String[] args)
	 {
		test2 s1=new test2(4);
		s1.display();
	 }
}
		