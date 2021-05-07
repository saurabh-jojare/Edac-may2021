import java.util.Scanner;
class Factorial{

  public static void main (String s[]){

    int a ,i, fact=1 ;
	Scanner sd = new Scanner(System.in);
	System.out.println("enter a number");
	a= sd.nextInt();
	
	if(a==0 || a==1)
	{
	System.out.println(" Factorial is 1 ");
	}
	else 
	{
	for(i=1; i<=a; i++)
	{
	fact = fact *i;
	}
	}
	System.out.println(+fact+ " is Factorial");
	
	
  }
}