class Example21{
    int a=100;
    static void m1(Example21 ref){
		System.out.println("Inside m1 method");
		System.out.println(ref.a);
     }

		public static void main(String[] args) 
	   {
			System.out.println("Start");
			// Example21 re1=new Example21();  1.approach ->named object
			// m1.ref();

			m1(new Example21());
			System.out.println("Stop");
	    }
}
