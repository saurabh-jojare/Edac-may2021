package Queue;
import java.util.Scanner;

public class BankRun 
{
	
	
			public static void main(String arg[]) 
			{
		        Scanner sc = new Scanner(System.in);
		
		        
		        System.out.print("Enter how many cust. to be created : ");
		        int n = sc.nextInt();
		        Bank C[] = new Bank[n];
		        for (int i = 0; i < C.length; i++) {
		            C[i] = new Bank();
		            C[i].openAccount();
		        }

			       
			        int ch;
			        do {
			            System.out.println("Main Menu");
			            System.out.println("1. Display All");	
			            System.out.println("2. Search By Account");
			            System.out.println("3. Deposit");
			            System.out.println("4. Withdrawal");
			            System.out.println("5.Exit ");
			            System.out.println("Enter your Choice :");
                        ch = sc.nextInt();
                    switch (ch) {
                    case 1:
                        for (int i = 0; i < C.length; i++) {
                            C[i].showAccount();
                        }
                        break;

                    case 2:
                        System.out.print("Enter Acc no to Search.. : ");
                        String acn = sc.next();
                        boolean found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Account Not Exist..");
                        }
                        break;

                    case 3:
                        System.out.print("Enter Account no : ");
                        acn = sc.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].deposit();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Account Not Exist..");
                        }
                        break;

                    case 4:
                        System.out.print("Enter Account No : ");
                        acn = sc.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].withdrawal();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("1Account Not Exist..");
                        }
                        break;

                    case 5:
                        System.out.println("Good Bye..");
                        break;
                }
            }
            while (ch != 5);
        }

}
