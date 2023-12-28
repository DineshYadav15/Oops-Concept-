 import java.util.*;
 class IfCondition
 {
	 public static void main(String args[])
	 {
		 Scanner s1=new Scanner(System.in);
		 System.out.println("Enter the any numbers");
		 int number=s1.nextInt();
		 int cost;
		 if(number<=100)
		 {
			 cost=5;
		 }
		 else if(number <=500)
		 {
			 cost=8;
		 }
		 else if(number<1000)
		 {
			 cost=10;
		 }
		 else{
			 cost=12;
		 }
		 System.out.println("The cost associated with the distance " + number + " is: " + cost);
	 }
 }
