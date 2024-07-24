package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03 {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("둘리");
		hashSet.add("또치");
		hashSet.add("도우너");
		hashSet.add("도우너"); //중복된 값은 추가 불가
		System.out.println("set 목록: " + hashSet + " 크기: " + hashSet.size());
		
		hashSet.remove("도우너"); //순서가 없는 set은 인텍스가 사용 불가
		System.out.println("set 목록: " + hashSet + " 크기: " + hashSet.size());
		
		Iterator<String> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			String member = ir.next();
			System.out.print(member + " ");
		}
		
		for(String member : hashSet) {
			System.out.print(member + " ");
		}

	}

}
