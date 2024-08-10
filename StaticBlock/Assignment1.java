class Assignment1 
{
	static
	{
		System.out.println("Inside static block");
		Assignment1 ref=new Assignment1();
	}
	Assignment1(){
		System.out.println("Inside m1 method");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Start");

		System.out.println("Stop");
	}
}
 