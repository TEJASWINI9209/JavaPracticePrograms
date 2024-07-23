class Example17 
{
	int a=100;
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Example17 ref1=new Example17();
		System.out.println(ref1.a);
		m1(ref1);
		System.out.println("Stop");

	}
	static void m1(Example17 ref2){
		System.out.println("Inside m1 method");
		System.out.println(ref2.a);
	}
}
