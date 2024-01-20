abstract class Abstraction
{
	//int no_no_of_tyers;
	abstract void start();
}
class Car extends Abstraction
{
	void start()
	{
		System.out.println("Car with Start with kick");
	}
}
class Scooter extends Abstraction
{
	void start()
	{
		System.out.println("Scooter Start with kick");
	}
	public static void main(String[] args)
	{
		Car s1=new Car();
		s1.start();
		Scooter s2=new Scooter();
		s2.start();
	}
}