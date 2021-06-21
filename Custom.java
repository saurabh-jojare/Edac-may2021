package Exceptionn;
import java.util.*;
class MyException extends RuntimeException
{
	MyException(String age)
	{
		super(age);
	}
}


public class Custom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		try
		{
				if(x<18)
				{
					throw new MyException("not eligible");
				}
				else if(x>60)
				{
					throw new MyException("too old");
				}
				else
				{
					System.out.println("eligible");
				}
		}
		catch(MyException e)
		{
			System.out.println("Handled");
			
		}
		System.out.println("Done");
	}

}
