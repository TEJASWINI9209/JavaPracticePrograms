class Example11 
{
	int a;
	Example11(){
		System.out.println("Inside 0 arg const "+a);
		a=10;
	}
	void m1(){
		System.out.println("Inside m1 method "+a);
		a=100;
	}
	public static void main(String[] args) 
	{
		Example11 ref =new Example11();
		ref.m1();
		System.out.println("Inside main method "+ref.a);
	}
}
