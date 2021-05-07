import java.util.Scanner;
class Fibonacci{

  public static void main (String s[]){

    int a  ;
	int n1 = 0,n2= 1,n3 ,i;
	Scanner sd = new Scanner(System.in);
	System.out.println("enter a no");
	a= sd.nextInt();
	
    System.out.print(+n1+ " "+n2);
	for(i =2 ;i<=a; i++)
	{
		n3=n1+n2;
		System.out.print(" "+n3);
	  n1= n2;
	  n2 =n3;
	//  n3 =n1 +n2;
	
	
	}
  }
  
}