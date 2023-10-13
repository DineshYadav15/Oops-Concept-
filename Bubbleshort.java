class Bubbleshort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,45,12,67,23,78};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("shorted array = " + arr[i]);
		}

	}

}
