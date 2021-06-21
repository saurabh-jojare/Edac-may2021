package Queue;

class Queuelist {
	
	Node front , rear;
	
	Queuelist()
	{
		front=rear=null;
	
		
	}
	public void Display()
	{ 
		Node curr= front;
		int count=0;
		if(front == null)
			System.out.println("Linked Queue is Empty");
		  while(curr != null)
		  { 
			  System.out.print(+curr.data+" ");
			  curr=curr.next;
			  count++;
		  }
		  System.out.println(" ");
		  System.out.println("size is "+count);
		
	}
	
	public void EnqueueList(int x)
	{
		Node temp=new Node(x);
		if(front==null)
		{
			front=rear=temp;
		}
		rear.next=temp;
		rear=temp;
		//size++;
	}
	
	public void DequeueList()
	{
		if(front== null)
		{
			System.out.println("Linked Queue is Empty");
		}
		front=front.next;
		//size--;
		if(front==null)
		{
			System.out.println("Linked Queue is Empty");
		}
		
	}

}
