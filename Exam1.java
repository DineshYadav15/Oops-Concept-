interface l1
{
	void show(); //this methotd also coonet with sub class same as but it is not same it is error
	
}
interface l2
{
	 void display();
}
class Exam1 implements l1,l2
{
	public void show()//public complesary
	{
		System.out.println("1");
	}
	public void display()//public complesery
	{
		System.out.println("2");
	}
	public static void main(String[] args)
	{
		Exam1 s1=new Exam1();
		s1.show();
		s1.display();
	}
}