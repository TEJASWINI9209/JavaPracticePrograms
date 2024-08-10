class Demo{
	static
	{
		System.out.println("Inside Non-static block of Demo class");
	}
}
class Assignment1_1
{
	static
	{
		System.out.println("Inside Non-static block");
		Demo ref= new Demo();
		Assignment1_1 ref1=new Assignment1_1();
	}
	Assignment1_1(){
		System.out.println("Inside Const");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Start");

		System.out.println("Stop");
	}
}
 