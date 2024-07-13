class Fact1 
{
	public static void main(String[] args) 
	{
		int fact=1;
		int n=5;
		for (int i=1; i<=n;i++)
		{
			fact=fact*i;
		}

		System.out.println("The factorial of " + n + " is " + fact );
	}
}
