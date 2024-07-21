class Demo
{
	int a=10;
	int test1(int b){
		System.out.println("Inside test1 method");
		int result=a+b;
		return result;
	}
}

class Sample
{
	static int x=100;
	float test2(float y){
		System.out.println("inside test2 mesthod");
		float result2=x+y;
		return result2;
	}
		
}

class Example5 
{
	static int b=100;
	float y=200.5f;
	public static void main(String[] args) 
	{
		Demo d= new Demo();
		int result1=d.test1(b);
		System.out.println(result1);

		Example5 e=new Example5();
		Sample s=new Sample();
		float result2=s.test2(e.y);
		System.out.println(result2);
	}
}
