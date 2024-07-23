class Example13 
{
	Example13 ref;
	int a=100;
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Example13 retval=new Example13();
		retval.ref=new Example13();
		System.out.println(retval.ref.a);
		System.out.println("Stop");


	}
}
