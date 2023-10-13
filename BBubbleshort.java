class BBubbleshort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"dinesh","abhi","ram","monu","rani","guru"};
	    String temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
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
