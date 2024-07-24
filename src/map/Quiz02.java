package map;

import java.util.HashMap;
import java.util.Set;

public class Quiz02 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 100);
		
		map.replace("국어", 50);
		map.replace("수학", 60);
		map.replace("영어", 70);
		
		map.remove("영어");
		
		Set<String> keyset = map.keySet();
		
		for(String key : keyset) {
			System.out.println("[Key]: " + key + " [value]: " + map.get(key));
		}

		System.out.println(map);
		
		System.out.println(map.size());
	}

}
