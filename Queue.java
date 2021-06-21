package Queue;

class Queue {

	int rear=-1;
	int front = -1;
	int size=5;
	int arr[] = new int[size];        /// int array stack implemenation
	
	
				public void Enqueue(int x)
				{
					if(rear == size-1)
					{
						System.out.println("Queue is full");
					}
					
			        arr[++rear]=x;
			       
			        
					
				}
				public void Dequeue()
				{
					if(rear==0)
					{
						System.out.println("Queue is Empty");	
					}
					int x;
					x=arr[++front];
					System.out.println("Element deleted "+x);
					arr[front]=0;
					//front++;
				}		
				public void Display()
				{
					for(int i =front; i<=rear; i++)
					{
						System.out.print(" "+arr[i]);
					}
					
				}
}

