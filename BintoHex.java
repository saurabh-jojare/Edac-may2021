// Binary to Hexadecimal

import java.util.Scanner;

public class BintoHex {
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
  
 // int deci1 = deci;
  int rem1;
   String str2="";
     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
 
     while(deci>0)
     {
       rem1=deci %16; 
       str2=hex[rem1]+str2; 
       deci=deci/16;
     }
     System.out.println(" Decimal to hexadecimal: "+str2);
  
  
 }
}
