class StaticMethod7
{
	public static void main(String[] args){
		int a=100;
		float b=200.5f;
		//StaticMethod7.test(a,b);  //valid
		test(a,b);   //valid
	}

	static void test(int aa,float bb){
		System.out.println("Inside test method");
		System.out.println(aa+bb);


	}
}