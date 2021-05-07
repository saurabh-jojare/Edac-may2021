import java.util.Scanner;
class Arith {
public static void main (String args[]){
	int a,b,c,d,e,f,g ;
	Scanner s = new Scanner(System.in);
	System.out.println("enter two number");
	a= s.nextInt();
	b= s.nextInt();
	
	
	c= a+b;
	d= a-b;
	e= a*b;
	f= a/b;
	g= a%b;
	
	System.out.println( +a+ "+" +b+ " is " +c);
	System.out.println( +a+ "-" +b+ " is " +d);
	System.out.println( +a+ "*" +b+ " is " +e);
	System.out.println( +a+ "/" +b+ " is " +f);
	System.out.println( +a+ "%" +b+ " is " +g);
    }
}