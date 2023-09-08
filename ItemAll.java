/*
  4. Write a java program to create a class Item with data members 
  Item_Code, Item_Name,Item_Price. Write method to accept and display 
  Item information also display number of objects created for a class.
 (Use Static variable and Static method)
*/
package constructer;
class Item
{
	int item_code;
	String item_name;
	int item_price;
	static int count;
	static void get()
	{
		System.out.println("number of item " +count);
	}
	Item(int item_code,String item_name,int item_price)
	{
		count++;
		this.item_code=item_code;
		this.item_name=item_name;
		this.item_price=item_price;
	}
	void itemdisplay()
	{
		
		System.out.println("Item is a item_code = " + item_code);
		System.out.println("Item is a item_name = " + item_name);
		System.out.println("Item is a item_price = " + item_price);
		
	}
	
}

public class ItemAll {

	public static void main(String[] args) {
		// TODO Auto-ge nerated method stub
		Item s1 =new Item(15234,"Burger",500);
		s1.itemdisplay();
		Item.get();
		Item s2 =new Item(1556,"Pizza",400);
		s2.itemdisplay();
		Item.get();

	}

}
