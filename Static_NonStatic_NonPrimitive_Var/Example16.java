class Cyber
{
	int a=100;
	void m1(){
		System.out.println("inside m1 meethod");
	}
}

class Success
{
	Cyber refvar;
}

class Example16 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Success s=new Success();
		s.refvar=new Cyber();
		System.out.println(s.refvar.a);
		s.refvar.m1();
		System.out.println("Stop");
	}
}
