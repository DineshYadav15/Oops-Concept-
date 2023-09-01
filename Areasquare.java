class Area
{
	public float side;
	Area(float side)
	{
		this.side=side;
	}
	void displayAreaofsquare()
	{
		System.out.println("Area of square : " + (side*side));
	}
}
class Areasquare
{
	public static void main(String args[])
	{
	Area s1=new Area(5);
	s1.displayAreaofsquare();
	}
}
