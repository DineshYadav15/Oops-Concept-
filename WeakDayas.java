import java.util.*;
class WeakDayas
{
	public static void main(String[] args) {
	 Scanner s1 = new Scanner(System.in);
    System.out.print("Enter the day number: ");
        int n = s1.nextInt();
       switch(n)
            {
            case 1:
                System.out.println("Sunday"); 
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday"); 
                break;
            case 4:
              System.out.println( "Wednesday");
               break;
            case 5:
               System.out.println("Thursday"); 
               break;
            case 6:
               System.out.println("Friday"); 
               break;
            case 7:
                System.out.println("Saturday"); 
                break;
            default:
    System.out.println("it is invalid number"); 
               
        }
    }
}
