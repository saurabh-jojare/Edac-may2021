import java.util.Scanner;
class Average {
public static void main (String args[]){
	int a,b,c,d ;
	Scanner s = new Scanner(System.in);
	System.out.println("enter three number");
	a= s.nextInt();
	b= s.nextInt();
	c= s.nextInt();
	
	d= (a+b+c)/3;
	
	System.out.println("Average is " +d);
    }
}