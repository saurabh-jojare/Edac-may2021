package Queue;


public class Test 
{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Node head =null;
	//	Node n = new Node(10);
       LinkedList list = new LinkedList();
       list.InsertAtBeg( 20);
       list.InsertAtBeg( 14);
       list.InsertAtBeg( 5);
       list.InsertAtBeg( 25);
       list.InsertAtBeg( 9);
       list.InsertAtEnd( 30);
       list.InsertAtPos(2,8);
       list.PrintList();
       list.CountNodes();
    //   list.Delete();
       list.PrintList();
       list.DeleteAll();
       System.out.println(" ");
       System.out.println("List is Deleted ");
     //  list.Delete(5);
       list.PrintList();
       list.InsertAtBeg( 25);
       list.InsertAtBeg( 9);
       list.PrintList();
    //   list.Delete(1);
       list.Delete(0);
       System.out.println(" ");
       list.PrintList();
     //  list.Delete(1);
       
	}

}

