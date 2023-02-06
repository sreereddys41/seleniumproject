package Methods;

public class methodExample3 extends methodExample2{

	int a=40;
	int b=20;
	
	public void addition()
	{
		int c=a+b;
		System.out.println("print the value of c: "+c);
	}
	
	void substraction()
	{
		int c=a-b;
		System.out.println("The value of c after substraction is :"+c);
	}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		methodExample3 m3=new methodExample3();
		m3.addition();
		m3.multiplication();
		m3.multiplication(12,5);
		

	}
	
	public void multiplication(int a,int b)
	{
		int c=a*b;
		System.out.println("The value of c after multiplication is "+c);
	}

}
