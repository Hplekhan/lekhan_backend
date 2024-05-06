package Day_04;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapRunnner {
	public static void main(String[] args) {
		
		HashMap<String, Integer> marks = new HashMap<>();
		
		marks.put("John", 10);
		marks.put("Abrahim", 420);
		marks.put("dhauu", 56);
		
		Iterator<String> ite = marks.keySet().iterator();
		
		while(ite.hasNext()) {
			String str = ite.next();
			System.out.println(str + " ====> " + marks.get(str));
		}
		
/*Method -2 to iterate*/
		
		Set<Entry<String,Integer>> entryset = marks.entrySet();
		
		for (Entry<String, Integer> entry : entryset) {
			System.out.println(entry.getKey() + "===>" + entry.getValue());
			
		}
	}

}
