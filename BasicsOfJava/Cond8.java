class Cond8 
{
	public static void main(String[] args) 
	{
		char signal='b';
		if (signal=='r')
		{
			System.out.println("STOP");
		}
		else if (signal=='g')
		{
			System.out.println("GO");
		}
		else if (signal=='y')
		{
			System.out.println("SLOW DOWN");
		}
		else{
			System.out.println("Invalid Color Signal");
		}
		
	}
}
