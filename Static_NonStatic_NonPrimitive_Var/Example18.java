class Success 
{
	char x='a';
	void test(){
		System.out.println("Inside test Method"+x);
	}
}

class Example18
{

	public static void main(String[] args) 
	{
		System.out.println("Start");
		Success ss=m1();
		ss.test();
		System.out.println(ss.x);


	}
	static Success m1(){
		System.out.println("Inside m1 method");
		Success s=new Success();
		s.test();
		return s;
	}
}
