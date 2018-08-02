import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestCollections {
	
	public static void main(String[] args) {
		
		// List Implementation
		List<String> list = new ArrayList();
		
		list.add("Sajid Ali");
		list.add("Nasir Farooq");
		list.add("Luqman Miraj");
		
		System.out.println("pring ArrayList Using Itrator");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// reverse the order of elements
		System.out.println("Reverse the order of the lsit");
		Collections.reverse(list);
		System.out.println(list);
		
		// sort the list
		System.out.println("Sort the list");
		Collections.sort(list);
		System.out.println(list);
		
		
		// copy Arraylist
		ArrayList<String> clonelist = (ArrayList<String>)list;
		System.out.println("Copy of List");
		System.out.println(clonelist);
		
		System.out.println(list);
		
		System.out.println("Remove Element at position 0 ");
		list.remove(0);
		
		System.out.println("Print ArrayList Using foreach Statement");
		for(String s: list) {
			System.out.println(s);
		}
		
		//after clear the clonelist
		System.out.println("after clear the clonelist");
		clonelist.clear();
		System.out.println(list);
		System.out.println(clonelist);
		
		List<Book> books = new ArrayList();
		Book b1 = new Book(1, "Linear System Theory", "Keven Haun");
		Book b2 = new Book(2, "Signal and System", "Openhieum");
		books.add(b1);
		books.add(b2);
		
		System.out.println("List of Books");
		for(Book b:books) {
			System.out.println("Book Id = "+ b.id + " is "+ b.name + " written by " + b.author );
		}
		
		// Set Implementation
		Set<String> set = new HashSet();
		set.add("sajid ali");
		set.add("nasir farooq");
		set.add("sajid ali");
		
		for(String s:set) {
			System.out.println(s);
		}
		
		Map<Integer, Book> bookmap = new HashMap();
		
		bookmap.put(1, b1);
		bookmap.put(2, b2);
		bookmap.put(1, b1);
		
		System.out.println("Map display using iterator");
		for(Map.Entry<Integer, Book> entry: bookmap.entrySet()) {
			int key = entry.getKey();
			Book b = entry.getValue();
			
			System.out.println("Detail of book of Key = " + key);
			System.out.println("id = "+ b.id + " Name = "+ b.name + " and author = " +b.author);
		}
		
		
		
		
	}

}
