class Example9
{
	static Example9 ref=new Example9();
	int a=100;
	public static void main(String[] args){
		System.out.println("start");
		System.out.println(Example9.ref.a);
		System.out.println(ref.a);
		System.out.println("Stop");
	}
}