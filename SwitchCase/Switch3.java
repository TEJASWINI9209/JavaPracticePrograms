class Switch3 
{
	public static void main(String[] args) 
	{
		char signal='g';
		switch(signal){
			case 'r' :System.out.println("Inside red statement");
					

			case 'g' : System.out.println("Inside green statement");
					   

			case 'y' : System.out.println("Inside Yellow statement");
					  

			default : System.out.println("Inside default statement");
					 
		}
	}
}

/* if we do not use break stmt inside switch then whichever case it matches that case onwards
till the end of the switch stmt all stmts will get executed */