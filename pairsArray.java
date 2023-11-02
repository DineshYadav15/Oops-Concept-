class pairsArray
{
	public static void main(String args[])
	{
	  int arr[]={2,4,3,5,6,7};
	  int tp=0;
	   for(int i=0;i<arr.length;i++)
	   {
		 int curr=arr[i];
		 for(int j=i+1;j<arr.length;j++)
		 {
			 System.out.print("(" + curr + "," + arr[j] + ")");
			 tp++;
		 }
		 System.out.println();
	   }
	   System.out.println("total pairs is = " + tp);
	   
	}
}
		