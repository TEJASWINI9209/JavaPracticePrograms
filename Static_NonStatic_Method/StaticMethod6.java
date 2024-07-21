class StaticMethod6
{
	public static void main(String[] args) 
	{
		int x=100;
		test(x);
	}

	static void test(int a){
		
		System.out.println("Inside test method");

		System.out.println(a);
		
	}
}
