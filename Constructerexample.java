/*
2.Create class product, take data members as product_id ,
 product_name ,  manufacturing_date , and price.
 Write constructor which will give default values to the object. 
 Write one parameterised constructor.
 Create 3 objects and print values of 3 objects.  
 */
 class Product
 {
	  int product_id;
	  String product_name;
	  int manufacturing_date;
	  double price;
	  Product()
	  
			  {
				  product_id=0;
				  product_name=" ";
				  manufacturing_date=0;
				  price=(0.0);
				   
			  }
			  Product(int product_id,String product_name,int manufacturing_date,
	          double price)
			  {
				  this.product_id=product_id;
				  this.product_name=product_name;
				  this.manufacturing_date=manufacturing_date;
				  this.price=price;
			  }
			  
			  void displayProduct()
			  {
				  System.out.println("product details:");
				  System.out.println("product_id:" + product_id);
				  System.out.println("product_name:" + product_name);
				  System.out.println("manufacturing_date:" +manufacturing_date );
				  System.out.println("product price:" +price);
			  }
			  
 }
 class Constructerexample
 {
	 public static void main(String args[])
	 {
	  Product s1=new Product(0," ",0,0.0);
	 s1.displayProduct();
	 Product s2=new Product(1,"dinesh",1464,120.12);
	 s2.displayProduct();
	 Product s3=new Product(2,"ravi",1234,120.12);
	 s3.displayProduct();
	  
	 
	 }
 }
	 
	 
				  
			  
				  