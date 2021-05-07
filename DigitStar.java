/*       1 
         1 2 
         1 2 3 
         1 2 3 4 
         1 2 3 4 5      */


class DigitStar
{
    public static void printNums(int n) 
    { 
        int i, j,num; 
    
        for(i=0; i<n; i++) // outer loop for rows
        { 
            num=1; 
            for(j=0; j<=i; j++) // inner loop for rows
            {
                System.out.print(num+ " "); 
                num++; 
            } 
            System.out.println(); 
        } 
    } 
       public static void main(String args[]) 
    { 
        int n = 5; 
        printNums(n); 
    } 
}