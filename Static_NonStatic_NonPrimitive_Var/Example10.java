class Example10 
{
	static Example10 ref;  //value=null
	static Example10 retval;
	public static void main(String[] args) 
	{
		System.out.println("start");

		System.out.println(ref);
		retval=new Example10();
		retval.m1();
		System.out.println("Stop");
	}
	void m1(){
		System.out.println("Inside m1 method");
	}
}
