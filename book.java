class Book1
{
	private String title;
	private  String publiser;
	private String auther;
	Book1(String title,String publiser,String auther)
	{
		this.title=title;
		this.publiser=publiser;
		this.auther=auther;
	}	
	void displaybookofdetails()
	{
		System.out.println("Title of book     : " + title);
		System.out.println("Publiser of book  : " + publiser);
		System.out.println("Auther of book    : " + auther);
	}
}
class book
{
	public static void main(String args[])
	{
		Book1 s1=new Book1("java","dinesh","jemes ghosling");
		s1.displaybookofdetails();
		System.out.println("------------------------------------");
		Book1 s2=new Book1("html","ajit","rahim rohan");
		s2.displaybookofdetails();
		System.out.println("------------------------------------");
		Book1 s3=new Book1("c++","ram","jemesvikaram");
		s3.displaybookofdetails();
		System.out.println("------------------------------------");
		Book1 s4=new Book1("maths","pradeep"," ghosling");
		s4.displaybookofdetails();
		System.out.println("------------------------------------");
		Book1 s5=new Book1("hindi","gautam","jemes ");
		s5.displaybookofdetails();
		}
}