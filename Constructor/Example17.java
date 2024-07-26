class Example17 
{
	int a;
	Example17(int a){
		this();
		this.a=a;
		System.out.println(a);
	}

	Example17(){
		System.out.println("Inside 0 arg constructor");
	}

	void m1(int a){
		this.a=a;
		System.out.println(this.a);
	}

	public static void main(String[] args) 
	{
		Example17 ref=new Example17(100);
		ref.m1(200);
	}
}
