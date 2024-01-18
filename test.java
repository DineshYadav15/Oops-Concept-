class test
{
	//constructer example
	test()
	{
		this(20);
		System.out.println("it is default number");
	}
	test(int a)
	{
		//this();
		System.out.println("it is parameterised");
	}
	public static void main(String args[])
	{
		test t1=new test();
	}
}