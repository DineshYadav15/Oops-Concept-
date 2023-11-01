class Reversefunction 
{
	public static void main(String[] args)
	{
		int arr[]={2,3,5,7,1,2,3,15};
		reverse(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}
	static public void reverse(int arr[])
	{
		int start=0;int end=arr.length-1;
		while(start<end)
		{
			int temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			start++;
			end--;
		}
	}
}