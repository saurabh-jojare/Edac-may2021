package Queue;

class Questack {
	
	
	int top=0;
	int size=10;
	char stack[] = new char[size];

	int rear=-1;
	int front = -1;
	int sizee=5;
	int arr[] = new int[size];
	
	
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



				public void push(char x)
				{
					// check overflow
					if (top ==size-1)
					{
						System.out.println("Stack is full");
					}
					
					    
						stack[top]= x;	
						top++;
				}
				
				public void pop()
				{
					// check Underflow 
						if (top == 0)
						{
							System.out.println("Stack is empty");
						}
					    char x;
					  //  top--;
			            x = stack[top];
			            stack[top]=0;
			            top--;
			          //  return x;
					
				}
				public void size()
				{
					System.out.println("Stack size is "+top);
					
				}
				public char peek()
				{
					char x;
					x=stack[top-1];
					return x;
				}
				
				public void display()
				{
					for(char n : stack)
					{
						System.out.println(n+" ");
					}
					
					
				}

				public boolean isEmpty() {
					// TODO Auto-generated method stub
					return false;
				}

	
	

}
