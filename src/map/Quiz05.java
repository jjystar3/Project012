package map;

import java.util.Collection;
import java.util.HashMap;

public class Quiz05 {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();

		System.out.println("MemberHashMap를 생성하고 4명의 회원을 추가하세요!");

		memberHashMap.addMember(new Member(1001, "둘리"));
		memberHashMap.addMember(new Member(1002, "또치"));
		memberHashMap.addMember(new Member(1003, "도우너"));
		memberHashMap.addMember(new Member(1004, "고길동"));

		memberHashMap.showAllMember();

		System.out.println("MemberHashMap에 1004번 회원이 있으면 삭제하세요!");

		memberHashMap.removeMember(1004);

		memberHashMap.showAllMember();

	}

}

class MemberHashMap {

	HashMap<Integer, Member> map;

	// 생성자의 목적: 인스턴스 생성 + 초기화
	public MemberHashMap() {
		this.map = new HashMap<>();
	}

	void addMember(Member member) {
		map.put(member.memberId, member);
	}

	void removeMember(int memberId) {
		if (map.containsKey(memberId)) {
			map.remove(memberId);
			System.out.println(memberId + "번 회원을 삭제하였습니다");
			return;
		}
		System.out.println(memberId + "번 회원이 존재하지 않습니다");
	}

	void showAllMember() {

		Collection<Member> values = map.values();
		for (Member m : values) {
			System.out.println(m);
		}
		System.out.println();
	}

}