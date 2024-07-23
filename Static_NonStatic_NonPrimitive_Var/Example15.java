class Example15 
{
	Example15 ref1;
	public static void main(String[] args) 
	{
		System.out.println("Sart");
		Example15 ref2=new Example15();
		ref2.ref1=new Example15();
		ref2.ref1.m1();
		System.out.println("Stop");
	}
	void m1(){
		System.out.println("Inside m1 method");
	}
}
