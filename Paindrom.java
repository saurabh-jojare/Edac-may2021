import java.util.Scanner;
class Armstrong{

  public static void main (String s[]){

    int n ,x =0,a, c=0 ;
	
	Scanner sd = new Scanner(System.in);
	System.out.println("enter a number");
	n = sd.nextInt();
	x=n;
	while( n>0 )
	{
		a = n%10;
		n = n/10;
		c = c+(a*a*a);
	}
	
	if(x == c)
	{
	System.out.println(" Number is palindrom number ");
	}
	else{
		System.out.println(" Number is not palindrom number ");
	}
	
	
	
  }
}