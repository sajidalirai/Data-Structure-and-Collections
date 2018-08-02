import java.util.*;
import java.util.Map.Entry;

public class HashSetTest {
	
	public static void main(String[] args) {
		
		
		Map<Integer, String> employee = new HashMap<Integer, String>();
		
		employee.put(1, "Nawaz");
		employee.put(2, "Nazir");
		employee.put(1, "Rehmat");
		employee.put(4, "Ali");
		employee.put(6, "Rehman");
		employee.remove(2);
		System.out.println("Employee with key 1 is "+employee.get(1));
		System.out.println();
		
		//Used keySet() method
		System.out.println("Display Map Using keySet() method");
		Set employeeCode = employee.keySet();
		
		
		Iterator<Integer> iterator = employeeCode.iterator();
		int a;
		while(iterator.hasNext()) {
			a = iterator.next();
			System.out.println(employee.get(a)+ " has key "+ a);

		}
		//Used entrySet() method
		System.out.println();
		System.out.println("Display Map Using entrySet() method");
		Set s = employee.entrySet();
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getValue() + " has key "+ me.getKey());
		}

		
		
		Set<Integer> hs =  new HashSet<Integer>();
		hs.add(5);
		hs.add(6);
		hs.add(12);
		hs.add(9);
		hs.add(13);
		hs.add(45);
		hs.add(98);
		
		Iterator<Integer> it1= hs.iterator();
		System.out.println();
		System.out.println("Access the values of a HashSet");
		while(it1
				.hasNext()) {
			System.out.println(it1.next());
		}
	}

}
