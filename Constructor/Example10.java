class Example10 
{
	Example10(){
		this(100);
		System.out.println("Inside 0 arg const");
	}
	Example10(int a){
		System.out.println("Inside 1 arg const");
	}
	Example10(int a, float b){
		this();
		System.out.println("Inside 2 arg const");

	}
	public static void main(String[] args) 
	{
		Example10 ref =new Example10(10,20.5f);
	}
}
