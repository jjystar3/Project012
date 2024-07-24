package map;

import java.util.Collection;
import java.util.HashMap;

public class Ex01 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "사과");
		map.put(2, "바나나");
		map.put(3, "코코넛");
		System.out.println("hashMap: " + map);
		
		map.replace(2, "블루베리");
		System.out.println("hashMap: " + map);

		map.remove(1);
		System.out.println("hashMap: " + map);
		
		int size = map.size();
		System.out.println("map 크기: " + size);
		
		Collection<String> values = map.values();
		System.out.println("값 목록: " + values);
		
		if(map.containsKey(1)) {
			System.out.println("map에 1라는 키가 있습니다");
		}else {
			System.out.println("map에 1라는 키가 없습니다");
		}
		
	}

}
