class Example9 
{
	Example9(){
		this(10);
		System.out.println("Inside 0 arg const");
	}
	Example9(int a){
		System.out.println("Inside 1 arg const");
	}
	public static void main(String[] args) 
	{
		Example9 ref =new Example9();
	}
}
