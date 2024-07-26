class Assignment2 
{
	Assignment2(){
		System.out.println("Within Assignment2 Constructor");
		m1();

	}

	void m1(){
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args) 
	{
		Assignment2 ref =new Assignment2();
	}
}
