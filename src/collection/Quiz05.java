package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Quiz05 {

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<>();
		
		hashSet.add(3);
		hashSet.add(7);
		hashSet.add(13);

		System.out.println(hashSet);
		System.out.println(hashSet.size());

		Iterator<Integer> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			int member = ir.next();
			System.out.print(member + " ");
		}
		
		for(int num : hashSet) {
			System.out.print(num + " ");
		}

	}

}
