class Example5
{
	Example5(int a, float b){
		System.out.println("Inside 2 arg const ");
		float result=a+b;
		System.out.println(result);
	}
	
	public static void main(String[] args) 
	{
		int a=100;
		float b=200.5f;
		Example5 ref1 =new Example5(a,b);
		
	
	}
}
