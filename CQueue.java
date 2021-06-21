package Queue;
public class CQueue 
{
	
	int rear=-1;
	int front = -1;
	int size=5;
	int arr[] = new int[size];
	
	
				public void Enqueue(int x)
				{
					if(rear == size-1 && front==-1 || rear == front-1 )
					{
						System.out.println("Circular Queue is full");
					}
					
			        arr[(++rear)%size]=x;
			       
			        
					
				}
				public void Dequeue()
				{
					if(rear==0)
					{
						System.out.println("Circular Queue is Empty");	
					}
					int x;
					x=arr[(++front)%size];
					System.out.println("Element deleted "+x);
					arr[front]=0;
					//front++;
				}		
				public void Display()
				{
					for(int i =0; i<size; i++)
					{
						System.out.print(" "+arr[i]);
					}
					
				}

 
}