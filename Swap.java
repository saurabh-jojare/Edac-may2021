import java.util.Scanner;
class Swap {
public static void main (String sa[]){
	int a,b, c;
//	int *c;
	Scanner s = new Scanner(System.in);
	System.out.println("enter two number");
	a= s.nextInt();
	b= s.nextInt();
	
	c = a;
	a = b;
	b = c;
	System.out.println("After Swapping "+a " " +b);
	
    }
}