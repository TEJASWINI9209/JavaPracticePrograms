class Example15 
{
	int a;
	Example15(){
		this(10);
		System.out.println("Inside 0 args const");
	}

	Example15(int a){
		this();   // error ->recursive calling Const
		System.out.println("inside 1 arg const");
	}
	public static void main(String[] args) 
	{
		Example15 ref= new Example15();
	}
}
