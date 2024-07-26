class Demo
{
	Demo(){
		
		System.out.println("Within Demo Constructor");
		
	}
}

class Sample
{
	Sample(){
		System.out.println("Within Sample Constructor");
		Demo d = new Demo();
	}
}

class Assignment1 
{
	Assignment1(){
		Assignment1 ref1=new Assignment1(10);
		System.out.println("Tejaswini");
	} 
	Assignment1(int a){
		System.out.println("Inside another Const");
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		Sample s =new Sample();
		Assignment1 ref=new Assignment1();
	}
}
