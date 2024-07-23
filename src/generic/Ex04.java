package generic;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		Integer i = list1.get(0);
		System.out.println(i);

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("aaa");
		String str = list2.get(0);
		System.out.println(str);

	}

}
