class Sample
{
	static
	{
		System.out.println("Inside static block of Sample class");
	}
	static void test(){
		System.out.println("Inside static test method of Sample class");
	}
	void m1(){
		System.out.println("Inside non-static m1 method of Sample class");
	}
}
class Assignment3_1
{
	static
	{
		System.out.println("Inside static block-Assignment3_1");
		Sample.test();
		Sample s=new Sample();
		s.m1();
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Start");

		System.out.println("Stop");
	}
}
 