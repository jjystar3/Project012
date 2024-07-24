package map;

import java.util.HashMap;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		
		HashMap<Integer, Member> map = new HashMap<>();

		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");

		map.put(member1.memberId, member1);
		map.put(member2.memberId, member2);
		map.put(member3.memberId, member3);
		
		System.out.println(map.get(1001));
		System.out.println(map.get(1002));
		System.out.println(map.get(1003));
		
		map.remove(1001);
		
		System.out.println("전체 회원 수: " + map.size());
		
		System.out.println(map);
		
		Set<Integer> keyset = map.keySet();
		
		for(int key : keyset) {
			System.out.println("[Key]: " + key + " [value]: " + map.get(key));
		}
		
	}

}

class Member {
	int memberId;
	String memberName;

	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}

}