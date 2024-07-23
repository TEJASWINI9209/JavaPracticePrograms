class System1
{
	static System1 out1; //reference var
	void println1(String message){
		System.out.println(message);
	}
}

class Example19 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		System1.out1=new System1();  //object of System1
		System1.out1.println1("Simulate SOP Statement");
		System.out.println("Stop");

	}
}
