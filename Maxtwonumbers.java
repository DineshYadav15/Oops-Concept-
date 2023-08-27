/*
class Write a java program using class which contains 
two variables of type integer. Create and 
initialize the object using parameterized constructor.
 Write a method to display maximum from given two numbers for all objects

*/
class Max
{
	int a,b;
	Max(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
	if(a>b)
	{
		System.out.println("A is greater then b : " + a);
	}
	else
	{
		System.out.println("B is greater then A : " + b);
	}
	}
	
}
     class Maxtwonumbers
       {
         public static void main(String args[])
        {
			Max s1= new Max(53,34);
			s1.display();
		}
	   
}
	
