class Cond5
{
	public static void main(String[] args)
	{
		char gender1='f',gender2='m';
		int age1=31, age2=41;

		if((gender1=='m' && age1>=18) || (gender2=='m' && age2>=21))
		{
			System.out.println("Eigible for marriage ");
		}

		else{
			
			System.out.println("Not eligible for marriage ");
		}
	}
}