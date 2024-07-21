class StaticMethod
{
	public static void main(String[] args) 
	{
		m1();
		StaticMethod.m1();
		System.out.println("Hello World!");
	}

	static void m1(){
		System.out.println("Inside m1 method");
	}
}
