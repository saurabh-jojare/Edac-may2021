package Queue;

public class Dstack {              // dynamic implementation of stack
	
	int top=-1;
	int size=5;
	int stack[] = new int[size];



				public void push(int x)
				{
					// check overflow
				/*	if (top ==size-1)
					{
						System.out.println("Stack is full");
					}
				*/	if (size() == size)
						{
					System.out.println("Stack is full");
							expand();
						}
					    
						stack[++top]= x;	
						//top++;
				}
				public void expand()
				{
					int length =size();
					int newStack[]=new int [size*2];
					System.arraycopy(stack, 0, newStack, 0, length);
					stack = newStack;
					size=size*2;
					
				}
				
				
				public int pop()
				{
					// check Underflow 
						if (top == -1)
						{
							System.out.println("Stack is empty");
						}
					    int x;
					  //  top--;
			            x= stack[top];
			            stack[top]=0;
			            top--;
			            return x;
					
				}
				public int size()
				{
					//System.out.println("Stack size is "+top);
					return top;
				}
				public int peek()
				{
					int x;
					x=stack[top-1];
					return x;
				}
				
				public void display()
				{
					for(int n : stack)
					{
						System.out.println(n+" ");
					}
					
					
				}
				
				
				
				


}
