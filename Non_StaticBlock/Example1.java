class Example1 
{
	{
		System.out.println("Inside non-Static block");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Example1 ref =new Example1();
		System.out.println("Stop");
	}
}
