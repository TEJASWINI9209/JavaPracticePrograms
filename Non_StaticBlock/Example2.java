class Example2
{
	{
		System.out.println("Inside non-Static block - One");
	}
	{
		System.out.println("Inside non-Static block - Two");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Example2 ref =new Example2();
		System.out.println("Stop");
	}
}