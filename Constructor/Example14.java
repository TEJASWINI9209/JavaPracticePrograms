class Example14 
{
	Example14(){
		System.out.println("Inside 0 arg const");
	}

	void m1(){
		System.out.println("Inside m1 method");
		this();  //error: call to 'this' must be first statement in constructor
	}
	public static void main(String[] args) 
	{
		Example14 ref =new Example14();
		ref.m1();
	}
}
