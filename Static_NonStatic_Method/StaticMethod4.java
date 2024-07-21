class StaticMethod4
{
	public static void main(String[] args) 
	{
		int x=test();
	}

	static int test(){
		return 100;      // return stmt is compulsory to writen in last of method.
		System.out.println("Inside test method, not data returning");
		
	}
}
