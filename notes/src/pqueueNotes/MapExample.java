package pqueueNotes;

import java.util.Map;
import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map is not a part of COllection
		/*Real time use case -> lets say in an organization we have
		 * a lot of employees (ie multiple Brandons). With the help 
		 * of id's. Map stores key pair values
		 * Map doesnt allow primitive data types
		 * Hashmap does allow one null key and many no null values
		 * */
		
		Map<Integer,String> map = new HashMap<>();
		
		map.put(121, "Brandon");
		map.put(122, "Rachid");
		map.put(123, "Vijaya");
		map.put(124, "Gaurav");
		map.put(125, "Claudio");
		
		System.out.println(map);
		System.out.println(map.get(123));
		System.out.println(map.containsKey(123));
		System.out.println(map.containsValue("Claudia"));
		map.put(124, "Blaze");
		System.out.println(map);
		map.replace(123, "Chris");
		System.out.println(map);
		map.putIfAbsent(126, "Ajay");
		System.out.println(map);
	}

}
