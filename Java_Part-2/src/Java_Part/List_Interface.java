package Java_Part;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Pineapple");
		new List_Interface().printList(fruits);
		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		new List_Interface().printList(countries);
	}
	void printList(List<String> list){
		for(String element: list){
			System.out.println("Element: "+element);
		}
		System.out.println("*****************************");
	}
}
