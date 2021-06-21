package Exceptionn;



public abstract class Test {

	static void validate(int x)
	{
		if(x<18)
		{
			throw new ArithmeticException("Not Valid");
		}
		else
		{
			System.out.println("welcome to vote");
		}
	}
	static void m()
	{
		validate(25);
	}
	static void p()
	{
		m();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		p();
		}
		catch(Exception e)
		{
			System.out.println("Handled");
		}
		System.out.println("rest code");
	}

}
