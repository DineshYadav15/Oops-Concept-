package controlstmt;
import java.util.Scanner;
class Assignment 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub;
		Scanner s1 = new Scanner(System.in);
		  System.out.print("Enter the candidate's gender (M/F): ");
	        char gender = s1.next().charAt(0);

	        System.out.print("Enter the candidate's age: ");
	        int age = s1.nextInt();

	        System.out.print("Enter the candidate's height (in cm): ");
	        int height = s1.nextInt();

	        
	        boolean isRecruited = false;

	        if (gender == 'M' || gender == 'm')
				{
	            if (age > 30 && height > 160)
					{
	                isRecruited = true;
	                }
	            } 
			else if (gender == 'F' || gender == 'f') 
			{
	            if (age > 25 && height > 155) 
				{
	                isRecruited = true;
	            }
	        }

	        if (isRecruited) {
	            System.out.println("Congratulations! The candidate is recruited.");
	        } 
			else 
			{
	            System.out.println("Sorry, the candidate does not meet the recruitment criteria.");
			}
	}
	        
	        
}
	