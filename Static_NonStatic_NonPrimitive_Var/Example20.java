class Example20 
{
	void m1(){
		System.out.println("Indide m1 method");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Example20 ref=new Example20();   // Named object creation
		ref.m1();

		new Example20.m1();  //Nameless object Creation
		System.out.println("Stop");
	}
}
