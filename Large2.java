import java.util.Scanner;
class Large2{

  public static void main (String s[]){

    int a,b  ;
	Scanner sd = new Scanner(System.in);
	System.out.println("enter two number");
	a= sd.nextInt();
	b= sd.nextInt();
//	c= sd.nextInt();
	
	if(a > b)
	{
	System.out.println(+a+ " a  is greater number ");
	}
	else 
	{
	System.out.println(+b+ " b is greater number");
	}
	
  }
}