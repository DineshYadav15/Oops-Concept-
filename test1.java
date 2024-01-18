class test1
{
	//constructer example2
	int a;
	String name;
	test1()
	{
		System.out.println("it is default");
	}
	test1(int a,String name)
	{
		this();
		this.a=a;
		this.name=name;
	}
	public static void main (String args[])
	{
		test1 s1=new test1(10,"dinesh");
		System.out.println("id : " +s1.a+ " name : " +s1.name);
	}
}