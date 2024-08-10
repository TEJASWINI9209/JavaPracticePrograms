
class Assignment3
{
	static void  test(){
		System.out.println("Inside test method");
	}
	void m1(){
		System.out.println("Inside m1 method");
	}
	static
	{
		System.out.println("Inside static block");
		test();
		Assignment3 a1=new Assignment3();
		a1.m1();

	}	
	Assignment3(){
		System.out.println("Inside Const");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Start");

		System.out.println("Stop");
	}
}
 