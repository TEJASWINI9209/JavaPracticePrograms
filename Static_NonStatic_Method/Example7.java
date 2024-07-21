class Cyber
{
	int m3(int c){
		int result=c+30;
		return result;
	}
}
class Success
{
	int m2(int b){
		int c=b+20;
		Cyber cy=new Cyber();
		int result=cy.m3(c);
		return result;
	}
}

class Sample {
	int m1(int a){
	int b=a+10;
	Success s=new Success();
	int result=s.m2(b);
	return result;
   }
}
class Example7 {
	public static void main(String[] args) 
	{
		int a=10;
		Sample ex=new Sample();
		int result=ex.m1(a);
		System.out.ptintln(result);
		

	}
}
