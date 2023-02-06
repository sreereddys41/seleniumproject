package DateAndTime_Appln;

public class bhanuworktesting {
	
	int a=20;
	int b=15;
	
	
	public void addition()
	{
	
		int a=20;
		int b=15;
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		bhanuworktesting bwt=new bhanuworktesting();
		bwt.addition();
		bwt.substractiom();
		bwt.division();
	}
	
	public void substractiom()
	{
		int c=a-b;
		System.out.println(c);
	}
	
	void division()
	{
		int c=a/b;
		System.out.println(c);
	}
	protected void multiplication()
	{
		int c=a*b;
		System.out.println(c);
	}
	
	
}
