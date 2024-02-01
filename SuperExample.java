class SuperExample
{
	 private final String name;
	SuperExample(String name)
	{
		this.name=name;
	}
	public void display()
	{
		System.out.println("Parent name is = " + name);
	}
}
class Child  extends SuperExample
{
	public Child(String name)
	{
		super(name);
	}
	public void display()
	{
		System.out.println("child name is = " + name);
	}
}
class Example
{
	public static void main(String args[])
	{
		SuperExample s1=new SuperExample("Dinesh");
		s1.display();
		Child s2= new Child("gautam");
		s2.display();
	}
}