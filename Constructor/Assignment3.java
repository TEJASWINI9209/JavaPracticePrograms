class Assignment3{
	static int  var;
	Assignment3(){
		System.out.println("Inside Assignment3 constructor");
		var=100;
		System.out.println(var);
		m1();
	}

	static void m1(){
		System.out.println("Inside m1 method");
	}

	public static void main(String[] args) 
	{
		System.out.println("Start");
		Assignment3 ref = new Assignment3();
		System.out.println("Stop");
	}
}
