package Queue;


class Node 
{
	 Node front;
	  int data;
	  Node next;   // self referential structure in java
	  Node(int x)
	  {
		  this.data =x;
		  this.next =null;
	  }
	
}


