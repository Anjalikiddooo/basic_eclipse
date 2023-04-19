package collectionframework;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {
	public static void main(String args[]) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ramesh");
		al.add("Karan");
		al.add("Ramesh");
		al.add("Jagadeesh");
		
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}


}
