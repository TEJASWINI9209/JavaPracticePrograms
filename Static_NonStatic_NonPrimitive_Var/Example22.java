class Example22 
{
	static int a;
	float b;		
	
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Example22 ref1=new Example22();
		a=10;
		ref1.b=20.5f;
		System.out.println(ref1.a);
		System.out.println(ref1.b);

		Example22 ref2=new Example22();
		ref2.a=100;
		ref2.b=200.5f;
		System.out.println(ref2.a);
		System.out.println(ref2.b);

		a=300;
		ref1.b=350;
		ref2.b=400.5f;
		System.out.println(ref1.a);
		System.out.println(ref2.a);
		System.out.println(ref1.b);
		System.out.println(ref2.b);
		
		System.out.println("Stop");
		
	}

	
}
