package Queue;

class LinkedList 
{
	Node head;
	
	

	 public  Node InsertAtEnd ( int x)      // method to insert element at end
	  {   
		  Node temp = new Node(x);          // created new node & passed data
		  if(head == null)                  // check if list is empty or not
		  {
			 head = temp;
		  }
		  else
		  {
		  Node curr = head;
		  while(curr.next != null)         //   traverse till end of list & attach element
		  {
			  curr = curr.next;
		  }
		  curr.next =temp;
		//  temp.next=null;
		  }
		 return head;                  
	  }
	  
	  public  Node InsertAtBeg (int x)
	  {
		 
		  Node temp = new Node(x);
		  temp.next=null;
		  if (head == null)
		  {
			  head = temp;
			//  System.out.println("inserted node at begining");
		  }
		  else
		  {
			temp.next=head;
			 head = temp;
			//  System.out.println("inserted node at begining");
		  }
		  
		  return head;
	  }
	  
	  public  void PrintList()
	  {
		  Node curr =head;
		  while(curr != null)
		  {
			  System.out.print(curr.data+" ");
		    curr =curr.next;
		  }
	  }

	public void InsertAtPos(int pos, int x)
	{
		Node temp = new Node(x);
		if(pos==0)
		{	 InsertAtBeg(x);
		}
		else 
		{
			Node n = head; 
			for(int i=0;i<pos-1;i++)
			{
				n=n.next;
			}
			temp.next= n.next;
			n.next= temp;
		}
		
	}
	
	
	public void CountNodes()
	{
		int count=0;
		Node curr =head;
		  while(curr != null)
		  {
			 
		    curr =curr.next;
		    count++;
		  }
		  System.out.println();
		System.out.println("Length of List is "+count);
	}
	
	public void Delete(int pos)
	{
		if (pos==0)                         // to delete position 0 element
		{
			head=head.next;
		}
		else
		{
			Node n =head;
			Node n1 = null; 
			for(int i=0;i<pos-1;i++)
			{
				n=n.next;
			}
			if(n.next.next == null)              // to delete last element from the list
			{
			n.next=null;	
			}
			else
			{
			n1=n.next;
			n.next=n1.next;
			System.out.println("Deleted element is "+n1.data);
			n1=null;  // available for GC
			}
		}
	}
	public void DeleteAll()
	{
		head =null;
		//System.out.println("Deleted element is ");
		
	}
	public void reverse()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		Node prev ,next =null;
		prev=null;
		Node curr=head;
		while(curr !=null)
		{
			next=curr.next;    // temporary node hold 2nd location
			curr.next=prev;     // making next pointer null using prev 
			prev=curr;         // prev now pointing to head
			curr=next;         // curr move towards next node , link established in next loop.
		}
		head= prev;
			
	}
		
       public Node Merge(Node headA, Node headB)
       {
    	   Node dummy = new Node(0);
    	   Node tail = dummy;
    	   while(headA !=null && headB != null )
    	   {
    		   	
    		   // System.out.println(headA.data); 
    		   // System.out.println(headB.data); 
    		   	if(headA.data <= headB.data)
    		   	{
    		   		tail.next=headA;
    		   		headA=headA.next;
    		   		
    		   	}
    		   	else
    		   	{
    		   		tail.next=headB;
    		   		headB=headB.next;
    		   	}
    		   	tail=tail.next;
				 
    	   }

			  if(headA == null) 
			  {
				  tail.next=headB; 
				  headB=headB.next;
		      } 
			  if(headB==null) 
			  { 
				  tail.next= headA;
				  headA=headA.next;
			}
    	return dummy.next;
       }
       
       
       public Node Intersect(Node headA, Node headB)
       {
    	   
	    	   if(headA ==null && headB == null )   // check head is null or not
	    	   {        
	    		          return null;
	    	   } 
					    	   Node ptr =headA;
					    	   Node ptr1=headB;
				    	   while (ptr != ptr1)   // till both node come to same location traverse
				    	   {
				    		   	if(ptr == null)
				    		   	{
				    		   		ptr=headB;
				    		   	}
				    		   	else {
				    		   		ptr=ptr.next;
				    		   		
								 	}
						    		   	if (ptr1 ==null)
						    		   	{
						    		   		ptr1 = headA;
						    		   	}
						    		   	else
						    		   	{
						    		   		ptr1=ptr1.next;
						    		   	}
						    		   
										 
						    	   }
				    	   System.out.println("node is "+ptr);
						    	return ptr;
						       }

		
}
	
	


