package Queue;

 class DLL
 {
	 NodeD head;
	 
	 public void InserAtBeg(int x)
	 {
		 NodeD temp = new NodeD(x);
		 if(head ==null)
		 {
			 head = temp;
			 
		 }
		 else
		 {
			 temp.next=head;
			 head.prev=temp;
			 head =temp;
			
		 }
		  
	 }
	 
	  public  void PrintList()
	  {
		  NodeD curr =head;
		  while(curr != null)
		  {
			  System.out.print(curr.data+" --> ");
		    curr =curr.next;
		  }
	  }
	 
	 public void InsertAtEnd(int x)
	 {
		 NodeD temp =new NodeD(x);
		 NodeD curr =head;
		 if(head== null)
		 {
			 head =temp;
		 }
		 else
		 {
			 while(curr.next != null)
			 {
				 curr=curr.next;
			 }
			curr.next=temp;
			temp.prev=curr;
			
		 }
		 
		 
		 
		 
		 
		 
	 }
	 
	 public void InsertAtPos(int pos, int x)
	 {
		 NodeD temp =new NodeD(x);
		 if(pos==0)
		 {
			 InserAtBeg(x);
		 }
		 else
		 {
			 NodeD curr=head;
			 for(int i=0; i<pos-1;i++)
			 {
				 curr = curr.next;
			 }
	           NodeD n1=null;
	          n1= curr.next;
			 temp.next=n1;
			 n1.prev=temp;
			 temp.prev=curr;
			 curr.next=temp;
			
		 }
		 	 
	 }
	 public void DeleteAll()
	 {
		 head=null;
	 }
	 public void DeletePos(int pos)
	 {
		 if(head == null)
			 System.out.println("list is empty");
		 if(pos==0)
		 {
			 head=head.next;
		 }
		 else
		 {
			 NodeD curr=head;
			 NodeD n1=null;
			 NodeD n2=null;
			 for(int i=0;i<pos-1;i++)
			 {
				 curr=curr.next;
			 }
			 if(curr.next.next == null)              // to delete last element from the list
				{
				curr.next=null;	
				}
			 else
			    {
					 n1=curr.next;
					 n2=n1.next;
					 curr.next=n2;
					 n2.prev=curr;
					 n1=null; // available for GC
			    }
		 }
	 }
	 
	 public void CountNodes()
		{
			int count=0;
			NodeD curr =head;
			  while(curr != null)
			  {
				 
			    curr =curr.next;
			    count++;
			  }
			  System.out.println();
			System.out.println("Length of List is "+count);
		}
	 public void ReverseList()
	 {
		if(head ==null)
		{
			System.out.println("List is empty");
		
		}
		NodeD nextnode =null;
		NodeD curr=head;
		while(curr!=null)
		{
			nextnode=curr.prev;                   // hold the null val of curr.previous to break link
			curr.prev=curr.next;                // break link and store next address into prev and prev become next & point to next node.
			curr.next=nextnode;             //now, next is pointing to null & prev point to next address
			curr=curr.prev;               //traversing to next node using prev b,coz prev is now next.
		}
		 if (nextnode != null)
		    {
	            head = nextnode.prev;
	        }
		
		}
		
	 }
	 
	 

