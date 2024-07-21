class StaticMethod9
{
	public static void main(String[] args){
		int var1= m1();
		float var2= m2();

		float result=var1+var2;
		System.out.println(result);

		}

	static int m1(){
		int a=100;
		return a;
	}

	static float m2(){
		float b=200.5f;
		return b;
	}
}