class Example13 
{
	Example13(){
		System.out.println("Inside 0 arg const");
		this(10);   // error: call to this must be first statement in constructor
	}

	Example13(int a){
		System.out.println("Inside 1 arg const");
	}
	public static void main(String[] args) 
	{
		new Example13();
	}
}
