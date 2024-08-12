class Cyber
{
	{
	   System.out.println("Inside Cyber Non-Static block");	
	}
	Cyber()
	{
		  System.out.println("Inside Cyber 0 arg const");	
	}
}

class Success
{
	{
	   System.out.println("Inside Success Non-Static block");	
	}
	Success()
	{
		  System.out.println("Inside Success 0 arg const");	
	}
}

class Example6
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Cyber c1= new Cyber();
		Success s1 =new Success();
		System.out.println("Stop");
	}
}
