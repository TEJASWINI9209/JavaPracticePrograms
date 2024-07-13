class Break1
{
	public static void main(String[] args){
		for (int i=1; i<=5; i++)
		{
			System.out.println(i);
				if (i==3)
				{
					System.out.println("Inside if "+i);
					break;
				}
		}
	}
}
