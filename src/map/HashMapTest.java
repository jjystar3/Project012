package map;

import java.util.Collection;
import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<Integer, Student2> map = new HashMap<>();

		map.put(1001, new Student2(1001, "둘리"));
		map.put(1002, new Student2(1002, "도우너"));
		map.put(1003, new Student2(1003, "또치"));

		map.get(1001).addGrade("국어", 70);
		map.get(1001).addGrade("수학", 80);
		map.get(1001).addGrade("영어", 90);
		map.get(1002).addGrade("국어", 55);
		map.get(1002).addGrade("수학", 65);
		map.get(1002).addGrade("영어", 75);
		map.get(1003).addGrade("국어", 80);
		map.get(1003).addGrade("수학", 50);
		map.get(1003).addGrade("영어", 50);

		Collection<Student2> values = map.values();

		for (Student2 stu : values) {
			int sum = stu.getSum();
			double avg = sum / 3.0;
			System.out.println(stu.name + "의 총점: " + sum + ", 평균: " + avg);
		}

		System.out.println();
//
//		int korSum = 0;
//		int MathSum = 0;
//		int engSum = 0;
//
//		for (Student2 stu : values) {
//			korSum += stu.kor;
//			MathSum += stu.math;
//			engSum += stu.eng;
//		}
//		System.out.println("국어의 총점: " + korSum + ", 평균: " + korSum / 3.0);
//		System.out.println("수학의 총점: " + MathSum + ", 평균: " + MathSum / 3.0);
//		System.out.println("영어의 총점: " + engSum + ", 평균: " + engSum / 3.0);

	}

}

class Student2 {
	int num;
	String name;
	HashMap<String, Integer> map;

	public Student2(int num, String name) {
		this.num = num;
		this.name = name;
		this.map = new HashMap<>();
	}

	void addGrade(String subject, int grade) {
		map.put(subject, grade);
	}

	void removeGrade(String subject) {
		if (map.get(subject) != null) {
			map.remove(subject);
			System.out.println(subject + "과목을 삭제하였습니다");
			return;
		}
		System.out.println(subject + "과목이 존재하지 않습니다");
	}

	int getSum() {
		Collection<Integer> values = map.values();
		int sum = 0;
		for (int grade : values) {
			sum += grade;
		}
		return sum;
	}

}