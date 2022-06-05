package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListLesson {

	public static void main(String[] args) {
		
		int[] array = new int[3];
		array[2] = 12;
		array[0] = array[2];
		//[12] [] [12]
		//O(1)
		
		//N
		//O(N) worst case insert O(1) on average
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(3);
		arrayList.add(5);
		
		//[12] [5] [12] [] [] []
		
		//N
		LinkedList<String> linkedList = new LinkedList<String>();
		//head
		//O(N) bulma islemi
		//O(1) eleman ekleme
		// [prev 5 next] -------> <------- [prev 3 next] ------->
		// <------- [prev 9 next]
		//silme
		// [prev 5 next] -------v 
		// ^------- [prev 9 next]
		
		linkedList.add("merhaba");
		linkedList.add("dunya");
		if(linkedList.contains("dunya"))
			System.out.println("merhaba dunya");
		else
			System.out.println("merhaba");


	}

}
