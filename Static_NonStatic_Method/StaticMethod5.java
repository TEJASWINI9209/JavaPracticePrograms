class StaticMethod5
{
	public static void main(String[] args) 
	{
		int x=test();
	}

	static int test(){
		
		System.out.println("Inside test method, not data returning");
		return;
		return;  // 2 return stmt is not allowed
		
	}
}
