class StaticMethod1
{
	public static void main(String[] args) 
	{
		float x=test();
		
		System.out.println("Back to main.....");
		System.out.println(x);

	}

	static float test(){
		System.out.println("Inside test method");
		return 20.5f;
	}
}
