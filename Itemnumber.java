class Item
{
	private int item_code;
	private String item_name;
	private int item_price;
	public static int item_count=0;
	public Item(int item_code,String item_name,int item_price)
	{
		this.item_code=item_code;
		this.item_name=item_name;
		this.item_price=item_price;
		 
	}
	 public  void displayItemInformation()
	 {
        System.out.println("Item Code: " + item_code);
        System.out.println("Item Name: " + item_name);
        System.out.println("Item Price: " + item_price);
		
	 }
	 
	 
}
	
class Itemnumber
{
	public static void main(String args[])
	{
		Item s1=new Item(112,"paneer",1234);
		s1.displayItemInformation();
		
		
	}
}