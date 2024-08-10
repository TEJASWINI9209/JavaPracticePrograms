
class Assignment2
{
	static int a;
	void m1(){
		System.out.println("Inside m1 method");
	}
	static
	{
		System.out.println("Inside static block"+a);
		a=10;
		System.out.println(a);
		Assignment2 ref= new Assignment2();
		ref.m1();
	}
	Assignment2(){
		System.out.println("Inside Const");
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Start");

		System.out.println("Stop");
	}
}
 