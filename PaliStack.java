package Queue;
import java.util.Scanner;
//import java.lang.Collection.*;
public class PaliStack 

{
	

	    public static void main(String[] args) 
	    {

	    	System.out.print("Enter any string:");
	        Scanner in=new Scanner(System.in);
	        String inputString = in.nextLine();
	        String sd = inputString;
	        Stack stack = new Stack();

	        for (int i = 0; i < inputString.length(); i++) {
	            stack.push(inputString.charAt(i));
	        }
	        stack.display();

	        String reverseString = "";

	        while (!stack.isEmpty()) {
	            reverseString = reverseString+stack.pop();
	        }
         //   stack.display();
	        if (sd.equals(reverseString))
	            System.out.println("The input String is a palindrome.");
	        else
	            System.out.println("The input String is not a palindrome.");

	    

	    }
}
