package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("bir");
		set.add("iki");
		set.add("bir");
		set.add("4");

		set.remove("bir");
		set.forEach(e -> System.out.println(e));
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String e = it.next();
			System.out.println("it geziyor: " + e);
			if(e.equals("4"))
				it.remove();
		}
		
		set.forEach(e -> System.out.println(e));

	}

}
