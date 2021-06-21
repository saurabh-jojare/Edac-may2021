package Queue;

public class RunQueue 
{

	   public static void main(String a[])
	   {
/*		   Queue as= new Queue();
		   as.Enqueue(10);
		   as.Enqueue(20);
		   as.Enqueue(30);
		   as.Enqueue(40);
		   as.Enqueue(50);
		   as.Dequeue();
		   as.Dequeue();
		   as.Display();
*/
		   
		   CQueue cq =new CQueue();
		   cq.Enqueue(10);
		   cq.Enqueue(20); cq.Enqueue(30); cq.Enqueue(40);  cq.Enqueue(50); 
		   cq.Dequeue();  cq.Dequeue(); cq.Enqueue(10); cq.Enqueue(20); 
		   cq.Display();
		   
		   
	   }
	
}
