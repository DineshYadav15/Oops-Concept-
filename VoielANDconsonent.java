import java.util.*;
class VoielANDconsonent
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the any numbers");
		char ch=s1.next().charAt(0);
		if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')
			||(ch=='U')||(ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')
			||(ch=='u'))
			{
				System.out.println("it is voiels");
			}
			else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			{
				System.out.print("it is consonent");
			}
			else{
				System.out.println("it is infinate");
			}
		}
}
				