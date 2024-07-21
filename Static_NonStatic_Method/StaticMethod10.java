class Demo
{
	static  void m1(){
		System.out.println("Inside  Demo class -> m1 method");

	}
}


class StaticMethod10
{
	public static void main(String[] args){

		//Approach 1-> Directly
		//m1()  invalid

		//Approach 2-> className
		Demo.m1();  //valid
		
		//Approach 3-> Object
		// valid

	}
}