import java.util.*;
class Dayscovertyearmonth
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the days : ");
		int days=s1.nextInt();
		/*int years=days/365;
		int remainningDays=days%365;
		int weaks=remainningDays/7;
		remainningDays=remainningDays%7;
		System.out.println(years + " years ,"   + weaks + " weaks ," 
		+ remainningDays + " days ");*/
		int months=days/30;
		int remainingDays=days%30;
		int weeaks=remainingDays/7;
		remainingDays=remainingDays%7;
		System.out.println(months + " Months, " + weeaks + 
				" Weaks, " + remainingDays + " Days ");
		
		
	}

}
