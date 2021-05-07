import java.util.Scanner;
class Large{

  public static void main (String s[]){

    int a,b,c ;
	Scanner sd = new Scanner(System.in);
	System.out.println("enter three number");
	a= sd.nextInt();
	b= sd.nextInt();
	c= sd.nextInt();
	
	if(a > b && a > c)
	{
	System.out.println(+a+ "a  is greater number ");
	}
	else if(b > a && b > c )
	{
	System.out.println(+b+ "b is greater number");
	}
	else{
		System.out.println(+c+ " c is greater number");
		
	}
  }
}