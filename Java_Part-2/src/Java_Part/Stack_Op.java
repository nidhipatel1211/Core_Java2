package Java_Part;

import java.util.Stack;

public class Stack_Op {
	static Stack<Integer> demo = new Stack<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo.push(1);
		demo.push(2);
		demo.push(3);
		demo.push(4);
		demo.push(5);
		demo.push(6);
		demo.pop();

		if (demo.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Stack is not empty");
		}
		for (Integer temp : demo) {
			System.out.println(temp);
		}
		Stack_Op so = new Stack_Op();
		so.search_Stack(3);
		so.search_Stack(7);
	}

	void search_Stack(int arg) {
		int pos = demo.search(arg);
		if (pos < 0) {
			System.out.println(arg + " is not in stack");
		} else {
			System.out.println(arg + " is on " + pos + " Location");
		}
	}
}
