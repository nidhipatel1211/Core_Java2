package Java_Part;
import java.util.ArrayList;

public class arrayList {
	static ArrayList<String> listNames = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listNames.add("Chaand");
		listNames.add("John");
		listNames.add("Steve");
		listNames.add("Pooja");
		listNames.add("Salim");
		listNames.add("Rahul");
		listNames.add("Mia");
		listNames.add("Angel");
		arrayList app = new arrayList();
		app.displayList(listNames);
		

		System.out.println("************");
		app.removeNameByString("Pooja");
		app.displayList(listNames);
		System.out.println("************");
		System.out.println(listNames.get(3));

	}

	void displayList(ArrayList<String> names) {
		for (String name : names) {
			System.out.println(name);
		}

	}

	void removeNameByPosition(int position) {
		listNames.remove(position);
	}

	void removeNameByString(String name) {
		listNames.remove(name);
	}

}
