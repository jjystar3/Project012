package collection;

import java.util.ArrayList;

public class Quiz01 {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		
		for(char c : list) {
			System.out.println(c);
		}
		
		list.remove(1);
		
		System.out.println(list.size());
		
	}

}
