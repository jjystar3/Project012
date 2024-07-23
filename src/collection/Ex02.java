package collection;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {

		ArrayList<Member> list = new ArrayList<>();

		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");

		list.add(member1);
		list.add(member2);
		list.add(member3);
		list.add(member3); // 리스트의 특징: 순서 ㅇ, 중복 ㅇ

		Member m = list.get(0);
		System.out.println(m);

		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

		list.remove(0);

		System.out.println("전체 회원 수: " + list.size());

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			System.out.println(member);
		}

//		for(Member mem : list) {
//			System.out.println(mem.toString());
//		}

	}

}

class Member {
	int memberId;
	String memberName;

	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

//	@Override
//	public String toString() {
//		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
//	}

}