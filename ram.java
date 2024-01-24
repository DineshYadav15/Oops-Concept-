class ram
{   int a=5;
	void show(int a)
	{
		this.a=a;
	}
	void data()
	{
		System.out.println(+a);
	}
}
class rahim extends ram
{
	void display()
	{
		System.out.println("i am dinesh yadav");
	}
	public static void main(String[] args)
	{
		rahim s1=new rahim();
		s1.data();
		rahim s2=new rahim();
		s2.display();
	}
}
		
		
