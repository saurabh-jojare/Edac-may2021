import java.util.Scanner;
class Leap{

  public static void main (String s[]){

    int a  ;
	Scanner sd = new Scanner(System.in);
	System.out.println("enter a year");
	a= sd.nextInt();
	
	
	if( (a%4) == 0 && (a%100) != 0)
	{
	System.out.println(+a+ "  Leap year ");
	}
	else if( a%400 == 0)
	{
	System.out.println(+a+ "  is leap year");
	}
	else{
		System.out.println(+a+ "  is not leap year");
	}
	
  }
}
//  a%400 ==0 ||