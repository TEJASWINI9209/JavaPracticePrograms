class Demo
{
	float m1(){
		int x=10;
		float y=205f;
		float result1=x+y;
		return result1;

	}
}

class Sample
{
	float m2(){
		int x=100;
		float y=200.5f;
		float result2=x+y;
		return result2;

	}
}

class NonstaticMethod3
{
	float a;
	static float b;

	public static void main(String[] args){

		NonstaticMethod3 ref1= new NonstaticMethod3();

		Demo ref2=new Demo();

		Sample ref3= new Sample();

		ref1.a=ref2.m1();
		b=ref3.m2();

		System.out.println(ref1.a + b);

    }
}