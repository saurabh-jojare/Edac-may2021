import java.util.Scanner;
class Table {
public static void main (String args[]){
	int a ,i, b;
	Scanner s = new Scanner(System.in);
	System.out.println("enter a number");
	a= s.nextInt();
	
    for(i=1; i<=10;)
	{
		b = 8*i;
		System.out.println("8 *" +i+ "=" +b);
		i++;
	}
	
	
    }
}