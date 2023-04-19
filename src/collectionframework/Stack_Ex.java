package collectionframework;

import java.util.Iterator;
import java.util.Stack;


public class Stack_Ex {
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("Ayan");
		stack.push("Gayathri");
		stack.push("Arun");
		stack.push("Nithish");
		stack.pop();
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}


}
