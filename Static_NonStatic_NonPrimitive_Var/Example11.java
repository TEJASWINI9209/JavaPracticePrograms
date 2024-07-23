class Cyber
{
	int a=10;
	void m1(){
		System.out.println("Inside m1 method");
	}
}

class Example11 
{
	static Cyber ref;
	public static void main(String[] args) 
	{
		System.out.println("start");
		ref=new Cyber();
		System.out.println(ref.a);
		ref.m1();
		System.out.println("Stop");
	}
}
