 final class Finalclassc//it is not extends
	{
		void dis()
		{
		System.out.println("i am dinesh yadav");
		}
		final void dis()//it is not override
		{
			System.out.println("i am dinesh yadav");
		}
	} 
	class classd  extends Finalclassc
	{
		void dis()
		{
		System.out.println("i am brother of ravi yadav");
		super.dis();
		}
	}
class Finalample
{
	public static void main(String[] args)
	{
	 classd s1=new classd();
	s1.dis();
	}
}