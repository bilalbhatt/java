
import java.util.*;

public class labq2 {
	public static void main(String[] argv) throws Exception
	{
		try {

			// Creating object of ArrayList
			ArrayList<String>
				addEmployee = new ArrayList<String>();

			// adding employees to addEmployee
			addEmployee.add("Bilal");
			addEmployee.add("Sameer");
			addEmployee.add("Ashok");
			addEmployee.add("Vishwaratna");

			// print addEmployee
			System.out.println("ArrayList: "
							+ addEmployee);

			// Creating object of ListIterator<String>
			// using listIterator() method
			ListIterator<String>
				iterator = addEmployee.listIterator();

			// Printing the iterated value
			System.out.println("\nUsing ListIterator:\n");
			while (iterator.hasNext()) {
				System.out.println("employees are : "
								+ iterator.next());
			}
		}

		catch (NullPointerException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}
