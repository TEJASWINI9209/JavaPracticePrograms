class StaticMethod8 {
	public static void main(String[] args){
		int var1=100;
		float var2=200.5f;
		float result=test(var1,var2);
		System.out.println(result);

	}

	static float test(int a, float b){
		float result;
		result=a+b;
		return result;
	}
}