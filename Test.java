package Coolection;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>list=new ArrayList<String>();

		list.add("Saurabh");
		list.add("Vijay");
		list.add("Sachin");
		list.add(1, "Sarang");
		
		Iterator itr =list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
