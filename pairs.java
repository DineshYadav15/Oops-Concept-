class pairs
{
	public static void printpair(int number[])
	{
		int totalpair=0;
		for(int i=0;i<number.length;i++)
		{
			int curr=number[i];
			for(int j=i+1;j<number.length;j++)
			{
				System.out.print("(" + curr + "," + number[j] + ")");
				totalpair++;
			}
			System.out.println();
		}
		System.out.println(totalpair);
	}
	public static void main(String[] args)
	{
	int number[]={2,4,3,5,6,7,8};
	printpair(number);
	}
}
			