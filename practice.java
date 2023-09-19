class practice {
    public static void main(String[] args) {
    	
		Scanner s1= new Scanner(System.in);
		System.out.println("enter number:");
		int num1=s1.nextInt();
		int num2=s1.nextInt();
		int num3=s1.nextInt();
		int temp;
		if(num1<num2)
		{
		temp=num1;
		num1=num2;
		num2=num3;
		num3=temp;
		
		}
		System.out.println("enter the thid number" +num1);
		
		
		}
}