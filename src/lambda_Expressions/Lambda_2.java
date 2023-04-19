package lambda_Expressions;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.LinkedList;

public class Lambda_2 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		Consumer <Integer> var = (n) -> {
			System.out.println(n);
		};
		
		numbers.forEach(var);
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Hello World");
		list.add("Haiii!!!!");
		list.add("Bye!!!!");
		
		Consumer<String> ll = (n) -> {
			System.out.println(n);
		};
		
	      list.forEach(ll);
		
	}
 
}
