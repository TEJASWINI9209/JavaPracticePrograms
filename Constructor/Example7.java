class Example7
{
	int a;
	Example7(int a){
		System.out.println("Inside 0 arg const");
		this.a=a;
		System.out.println(this.a);
	}
	
	public static void main(String[] args) 
	{
		Example7 ref =new Example7(100);
	}
}
