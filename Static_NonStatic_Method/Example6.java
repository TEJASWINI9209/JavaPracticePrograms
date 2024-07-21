class Cyber{

	int test1(int x){
		System.out.println("Inside test1 method");
		int result1=x+10;
		return result1;
		
	}
}

class Success
{
	float test2(float y){
		System.out.println("Inside test2 method");
		//Example6 ex=new Example6();
		float result2=y+20.5f;
		return result2;
	}
}

class Training
{
	int a;
	static float b;
}

class Example6 
{
	static int x=100;
	float y=200;
	
	public static void main(String[] args) 
	{
		System.out.println("start");
		Cyber c= new Cyber();
		Training t=new Training();
		t.a=c.test1(x);
		Example6 ex=new Example6();
		Success ss=new Success();
		Training.b=ss.test2(ex.y);
		System.out.println(t.a);
		System.out.println(Training.b);

	}
}
