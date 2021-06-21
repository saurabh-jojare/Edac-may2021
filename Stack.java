package Queue;


public class Stack {

int top=0;
int size=10;
int stack[] = new int[size];
int stack1[] = new int [size];


            public void Insert(int x)
            {
            	if (top ==size-1)
				{
					System.out.println("Stack is full");
				}
            	
            	   
				stack1[top]= x;	
				top++;
            	
            	
            	
            }
			public void push(int x)
			{
				// check overflow
				if (top ==size-1)
				{
					System.out.println("Stack is full");
				}
				
				    
					stack[top]= x;	
					top++;
			}
			
			public int pop()
			{
				// check Underflow 
					if (top == 0)
					{
						System.out.println("Stack is empty");
					}
				    int x;
				  //  top--;
		            x = stack[top];
		            stack[top]=0;
		            top--;
		            return x;
				
			}
			public void size()
			{
				System.out.println("Stack size is "+top);
				
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

			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}
			
			
			
			
}
