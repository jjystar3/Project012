package map;

import java.util.HashMap;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {

		HashMap<Character, String> map = new HashMap<>();

		map.put('a', "사과");
		map.put('b', "바나나");
		map.put('c', "코코넛");

		Set<Character> keyset = map.keySet();

		for (char key : keyset) {
			if (key == 'b') {
				System.out.println("[Key]: " + key + " [value]: " + map.get(key));
			}
		}

		map.replace('b', "블루베리");
		map.remove('a');

	}

}
