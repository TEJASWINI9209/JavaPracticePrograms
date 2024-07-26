class Example3
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Example3 ref1 =new Example3();
		System.out.println("Stop");
		
	}
}

/*
javap Example3
Compiled from "Example3.java"
class Example3 {
  Example3(); --> default constructor created by compiler
  public static void main(java.lang.String[]);
}

*/