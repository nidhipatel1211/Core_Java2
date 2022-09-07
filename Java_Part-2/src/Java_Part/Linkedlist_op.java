package Java_Part;

import java.util.LinkedList;

public class Linkedlist_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Pinapple");
		new Linkedlist_op().printList(fruits);
		fruits.add(1, "Mango");
		fruits.add("Chika");
		new Linkedlist_op().printList(fruits);
		fruits.set(6, "Chiku");
		new Linkedlist_op().printList(fruits);
	    fruits.remove(4);
	    new Linkedlist_op().printList(fruits);
	
       }
	   void printList(LinkedList<String> list){
		for(String element: list){
			System.out.println("Element: "+element);
		}
		System.out.println("*****************************");
	
	}

}
