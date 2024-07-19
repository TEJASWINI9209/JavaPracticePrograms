class Switch2
{
	public static void main(String[] args) 
	{
		char signal='b';
		switch(signal){
			case 'r' :System.out.println("Inside red statement");
					  break;

			case 'g' : System.out.println("Inside green statement");
					   break;

			case 'y' : System.out.println("Inside Yellow statement");
					   break;

			default : System.out.println("Inside default statement");
					  break;
		}
		
	}
}
