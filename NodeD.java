package Queue;

 class NodeD 
 {
	 	 NodeD head;
	 	  int data;
	 	  NodeD next;     // self referential structure in java
	 	 NodeD prev;
	 	  NodeD (int x)
	 	  {
	 		  this.data =x;
	 		  this.next =null;
	 		  this.prev=null;
	 	  }
	 	
	 

}
