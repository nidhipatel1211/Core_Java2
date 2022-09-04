package Java_Part;

import java.util.ArrayList;

public class Autoboxing_Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> studentNumbers = new ArrayList<>();
		studentNumbers.add(25); //Autoboxing
		System.out.println(studentNumbers.get(0)); // unboxing 	
		ArrayList<Double> demoList = new ArrayList<>();
		demoList.add(25.5);
		//demoList.add(new Double(25.2));
		demoList.add(Double.valueOf(10.0)); //This is done while autoboxing
		//System.out.println(demoList.get(0));
		System.out.println(demoList.get(0).doubleValue()); //This is done while unboxing
	}

}
