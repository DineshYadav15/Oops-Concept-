import java.util.*;
class Lenearsearch
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the search element");
		int arr[]={1,3,4,6,3,6,7,8,89};
		int num=s1.nextInt();
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				System.out.println("Enter the search index position = " + i);
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("it is not found the number");
		}
	}
}
				