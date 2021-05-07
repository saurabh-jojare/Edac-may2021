import java.util.Scanner;
class Multi {
public static void main (String args[]){
	int a,b,c ;
	Scanner s = new Scanner(System.in);
	System.out.println("enter two number");
	a= s.nextInt();
	b= s.nextInt();
	
	
	c= a*b;
	
	System.out.println("Multplication of " +a+ "and" +b+ " is " +c);
    }
}