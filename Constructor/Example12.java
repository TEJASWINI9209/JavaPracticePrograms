class Example12 
{
	Example12(){
		System.out.println("inside 0 arg const-One");
	}

	Example12(){
		System.out.println("Inside 0 arg const-Two");   //error: constructor Example2() is already defined in class Example2
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		new Example12();
		System.out.println("Stop");
	}
}
