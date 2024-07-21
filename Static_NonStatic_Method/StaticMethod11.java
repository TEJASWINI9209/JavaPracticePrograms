class Cyber
{
	static char m1(char var1){
		System.out.println(var1);
   
   }
}

class Success
{
	static boolean m2(boolean var2){
		System.out.println(var2);

	}
}

class StaticMethod11
{
	public static void main(String[] args){

		char var1='x';
		boolean var2= true;
		Cyber.m1(var1);
		Success.m2(var2);
  }
}