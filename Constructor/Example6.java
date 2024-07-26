class Example6
{
	Example7(int a){
		System.out.println("Inside 0 arg const"+a);
	}
	
	public static void main(String[] args) 
	{
		Example7 ref1 =new Example7(10);
		Example7 ref2 =new Example7();  //error: invalid method declaration; return type required
	
	}
}
