// binary to decimal

import java.util.Scanner;

public class BintoDec {
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  int Num  ; int deci = 0 , j = 1, rem;
 
  System.out.print("Input a binary number: ");
  Num = sc.nextInt();

  while (Num != 0) 
  {
   rem = Num % 10;
   deci = deci + rem * j;
   j = j * 2;
   Num = Num / 10;
  }
  System.out.println("Decimal Number: " + deci);
  
 
  
 }
}
