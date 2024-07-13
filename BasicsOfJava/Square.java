import java.util.Scanner;
class Square
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();

		if(n<1)
		{
			System.out.println("Please enter a positive integer");
		}

		else{			
	
		int i=1;
		while (i<n)
		{
			System.out.println("The square of "+i+ " is "+ (i*i));
		
			i++;
		}
	 }
 }
 
}