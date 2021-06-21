package Queue;
import java.util.Scanner;

class Bank 
{
	
	private String accno;
    private String name;
    private long balance;

    Scanner sc = new Scanner(System.in);

				    void openAccount() 
				    {
				        System.out.print("Enter Account No: ");
				        accno = sc.next();
				        System.out.print("Enter Name: ");
				        name = sc.next();
				        System.out.print("Enter Balance: ");
				        balance = sc.nextLong();
				    }

				    	
				    void showAccount() 
				    {
				        System.out.println(accno + " " + name + " " + balance);
				    }

   
				    void deposit() 
				    {
				        long amt;
				        System.out.println("Enter Amount to Deposit : ");
				        amt = sc.nextLong();
				        balance = balance + amt;
				    }

    
				    void withdrawal() 
				    {
				        long amt;
				        System.out.println("Enter Amount to withdraw : ");
				        amt = sc.nextLong();
				        if (balance >= amt) {
				            balance = balance - amt;
				        } else {
				            System.out.println("Less Balance..Transaction Failed..");
				        }
				    }

				   
				    boolean search(String acn)   /// search in Acc
				    {
				        if (accno.equals(acn)) {
				            showAccount();
				            return (true);
				        }
				        return (false);
				    }



}

