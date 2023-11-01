

public class Binarysearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,6,8,11,23,45,78};
		int key=3;
     int start=0;
     int end=arr.length-1;
     while(start<=end)
     {
    	int mid=(start+end)/2;
    	if(arr[mid]==key)
    	{
    		System.out.println("index postion = " + mid);
			break;
    	}
    	else if(arr[mid]<key)
    	{
    		start=mid+1;
    		
    	}
    	else
    	{
    		end=mid-1;
    	}
     }
     if(start>end)
	   {
		   System.out.println("number is not found");
	   }
	   
	}

}
