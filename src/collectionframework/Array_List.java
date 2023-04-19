package collectionframework;

import java.util.Iterator;
import java.util.ArrayList;

public class Array_List {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Raju");
		list.add("Vijay");
		list.add("Raju");
		list.add("Arun");
		
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
