package collection;

import java.util.ArrayList;

public class Quiz04 {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();

		System.out.println("MemberArrayList를 생성하고 4명의 회원을 추가하세요!");

		memberArrayList.addMember(new Member(1001, "둘리"));
		memberArrayList.addMember(new Member(1002, "또치"));
		memberArrayList.addMember(new Member(1003, "도우너"));
		memberArrayList.addMember(new Member(1004, "고길동"));

		memberArrayList.showAllMember();

		System.out.println("MemberArrayList에 1004번 회원이 있으면 삭제하세요!");

		memberArrayList.removeMember(1004);

		memberArrayList.showAllMember();

	}

}

class MemberArrayList {

	ArrayList<Member> list;

	public MemberArrayList() {
		list = new ArrayList<Member>();
	}

	void addMember(Member member) {
		list.add(member);
	}

	void removeMember(int memberId) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).memberId == memberId) {
				list.remove(i);
				System.out.println(memberId + "번 회원을 삭제하였습니다");
				return;
			}
		}
		System.out.println(memberId + "번 회원이 존재하지 않습니다");
	}

	void showAllMember() {
		for (Member m : list) {
			System.out.println(m);
		}
		System.out.println();
	}

}