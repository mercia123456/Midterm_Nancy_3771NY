package src.datastructure;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class UseArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> arlist = new ArrayList<>();
		arlist.add(350);
		arlist.add(450);
		arlist.add(650);
		arlist.add(750);
		arlist.add(850);
		arlist.add(950);

		System.out.println(arlist.remove(2));


		System.out.println("Use of iterator using while loop: ");
		Iterator it = arlist.iterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			System.out.print(i);
		}

		Collections.sort(arlist);
		System.out.println(arlist);
		List list = new ArrayList();
		list = arlist;

		ConnectDB con = new ConnectDB();

		con.createTableFromStringToMySql("Midterm", "Number");

		con.InsertDataFromArrayListToMySql(list, "Midterm", "Number");
		List<String> num = con.readDataBase("Midterm", "Number");
		{
			for (String st : num) {
				System.out.println(st);

			}
		}

	}
}
		/*

		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
	

	}

}
