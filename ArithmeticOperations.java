class Arithmetic
{
	int num1,num2;
	Arithmetic(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	void display()
	{
		System.out.println("Add two numbers    : " +(num1+num2));
		System.out.println("Sub two numbers    : " +(num1-num2));
		System.out.println("Multi two numbers  : " +(num1*num2));
		System.out.println("div two numbers    : " +(num1/num2));
	}
}
class  ArithmeticOperations
{
	public static void main(String args[])
	{
		Arithmetic a1 = new Arithmetic(20,20);
		a1.display();
	}
}