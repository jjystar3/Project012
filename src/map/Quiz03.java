package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Quiz03 {

	public static void main(String[] args) {

		HashMap<String, Float> map = new HashMap<>();

		map.put("국어", 80.0f);
		map.put("수학", 90.0f);
		map.put("영어", 100.0f);
		
		Set<String> keyset = map.keySet();
		
		for(String str : keyset) {
			System.out.println(str);
		}

		Collection<Float> values = map.values();
		for(float value : values) {
			System.out.println(value);
		}
	}

}
