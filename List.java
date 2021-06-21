package Coolection;
import java.util.*;
public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String>al=new LinkedList<String>();
		al.add("Saurabh");
		al.add("Attarde");
		al.add("Jadhav");
		al.add(2, "Sanskruti");           // add to location
		al.add("20");                     // add string
		al.remove(2);                     // to remove element
		al.set(0, "Virat");                // change element
		Collections.sort(al);             // for sorting element
		Iterator<String> itr=al.iterator();       // to traverse list
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(String str:al)                 // to traverse list
		{
			System.out.println(str);
		}
		System.out.println(al);
	}

}
