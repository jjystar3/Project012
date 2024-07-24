package collection;

import java.util.ArrayList;

public class Quiz02 {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<Character>();

		list.add('A');
		list.add('B');
		list.add('C');

		for (int i = 0; i < list.size(); i++) {
			
			char ch = list.get(i);
			
			if (ch == 'A') {
				list.remove(i);
			}
		}

//		for (char c : list) {
//			System.out.println(c);
//		}

	}

}
