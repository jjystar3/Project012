package map;

import java.util.Collection;
import java.util.HashMap;

public class Quiz04 {

	public static void main(String[] args) {

		HashMap<Integer, Student> map = new HashMap<>();

		Student studnet1 = new Student(1001, "둘리", 90, 80, 70);
		Student studnet2 = new Student(1002, "도우너", 55, 65, 75);
		Student studnet3 = new Student(1003, "또치", 80, 50, 50);

		map.put(studnet1.num, studnet1);
		map.put(studnet2.num, studnet2);
		map.put(studnet3.num, studnet3);

		Collection<Student> students = map.values();

		for (Student stu : students) {
			int sum = stu.kor + stu.math + stu.eng;
			double avr = sum / 3.0;
			System.out.println(stu.name + "의 총점: " + sum + ", 평균: " + avr);
		}

		System.out.println();

		int korSum = 0;
		int MathSum = 0;
		int engSum = 0;

		for (Student stu : students) {
			korSum += stu.kor;
			MathSum += stu.math;
			engSum += stu.eng;
		}
		System.out.println("국어의 총점: " + korSum + ", 평균: " + korSum / 3.0);
		System.out.println("수학의 총점: " + MathSum + ", 평균: " + MathSum / 3.0);
		System.out.println("영어의 총점: " + engSum + ", 평균: " + engSum / 3.0);

	}

}

class Student {
	int num;
	String name;
	int kor;
	int math;
	int eng;

	public Student(int num, String name, int kor, int math, int eng) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

}