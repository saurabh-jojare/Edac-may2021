package Queue;
import java.util.*;


class Gfg {
	
	
 static class Queuee
	{
		
		 java.util.Stack<Integer> s1 =new java.util.Stack<Integer>();
		 java.util.Stack<Integer> s2 =new java.util.Stack<Integer>();
		
		public void enqueue(int x)
		{
				while(!s1.isEmpty())
				{
					s2.push(s1.pop());
				}
				// push item into s1
				s1.push(x);
			    // push everything back to s1
			while(!s2.isEmpty())
			{
				s1.push(s2.pop());
				//s2.pop();
			}
			
			
		}
		
		public int deQueue()
		{
			if(s1.isEmpty())
			{
				System.out.println("Q is empty");
				System.exit(0);
			}
			int x =s1.peek();
			s1.pop();
			return x;
		}
		
};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queuee qs = new Queuee();
		qs.enqueue(10);
		qs.enqueue(20);
		qs.enqueue(30);
		
		System.out.println(qs.deQueue());
		System.out.println(qs.deQueue());
		System.out.println(qs.deQueue());
		
		
		
	}

}
