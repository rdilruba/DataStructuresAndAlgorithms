package collections;

import java.util.Map.Entry;
import java.util.TreeMap;

public class MapLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("Dilruba", 25);
		tm.put("Ahmet", 19);
		tm.put("Zeynep", 43);
		tm.put("Berk", 24);
		tm.put("Defne", 17);
		
		System.out.println(tm.get("Dilruba"));
		System.out.println(tm.firstKey());
		System.out.println(tm.lastEntry());
		
		for(Entry<String, Integer> eleman: tm.entrySet()) {
			System.out.println(eleman);
		}
	}

}
