interface t1
{
	 void show();
}
class exam implements t1
{
	public void show()
	{
		System.out.println("1");
	}
	public static void main(String args[])
	{
		exam  s1=new exam();
		s1.show();
	}
}