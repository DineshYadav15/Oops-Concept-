class Persions
{
	private String name;
	private int age;
	private String city;
	   Persions()
	{
		this.name=" ";
		this.age=0;
		this.city=" ";
	}
	void Persions(String name,int age,String city)
	{
		this.name=name;
		this.age=age;
		this.city=city;
	}
	void display()
	{
		System.out.println("Name of persion : " + name);
		System.out.println("Age of persion : " + age);
		System.out.println("City of persion : " + city);
	}
}
class Persion
{
	public static void main(String args[])
	{
		Persions s1=new Persions("Dinesh",23,"pune");
		s1.display();
		System.out.println("---------------------------------");
		Persions s2=new Persions ("Ajit",26,"mumbai");
		s2.display();
	}
}
		