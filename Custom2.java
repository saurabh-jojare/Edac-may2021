package Exceptionn;
import java.util.*;


public class Custom2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int b=sc.nextInt();
		int x=50;
		int y ;
		try
		{
			
			 y=x/b;
			System.out.println("y");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println(e);
			System.out.println("Handled");
//			try
//			{
//			int z=x/b;
//			//System.out.println(e);
//			}
//			catch(ArithmeticException ae)
//			{
//				System.out.println(e);
//			}
//			
		}
		catch(ArithmeticException ae)
		{
			
			System.out.println(ae);
		}
		//
		finally
		{
			System.out.println("rest code");
		}
		sc.close();
	}

}
