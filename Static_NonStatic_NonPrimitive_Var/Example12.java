class Cyber
{
	int a=100;
}

class Success
{
	void m1(){
		System.out.println("Inside m1 method");
	}
}

class Tech
{
	static Cyber refvar;
	static Success retval;
}

class Example12 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Tech.refvar=new Cyber();
		System.out.println(Tech.refvar.a);

		Tech.retval=new Success();
		
		Tech.retval.m1();
		System.out.println("Stop");

	}
}
