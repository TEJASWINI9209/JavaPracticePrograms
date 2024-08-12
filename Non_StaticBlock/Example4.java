class Example4
{
	{
		System.out.println("Inside non-Static block - One");  
	}
	Example4()
	{
		System.out.println("Inside 0 arg Const");
	}
	Example4(int a)
	{
		System.out.println("Inside 1 arg Const");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Example4 ref1 =new Example4();
		Example4 ref2 =new Example4(10);
		System.out.println("Stop");
	}
}
