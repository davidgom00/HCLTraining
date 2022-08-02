package pqueueNotes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public class HashMapTest {

	
	/*When using hashmap, it will throw COncurrentModificationExceotion
	 * Wheras if you use consurrentHashMap then it both reads and writes
	 * Simultaneously
	 * Java Collection are fail-fast*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new ConcurrentHashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		
		Iterator<String> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println("map value : "+ map.get(key));
			if(key.equals("2")) {
				map.put("4", "4");
			}
		}
	}

}
