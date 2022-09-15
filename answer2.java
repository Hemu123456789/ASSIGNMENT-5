import java.util.Scanner;

class Studentclass {
	String name;
	String stu_id;
	int age;
  int mathsmarks;
	public Studentmarks() {
		this();
	}
	public Student(String initName, String initId, int age,int mathsmarks;) {
		name = initName;
		stu_id = initId;
		age = intage;
    mathsmarks = intmathsmarks;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of students:");
		int n = Integer.parseInt(in.nextLine().trim());
		System.out.println("Input Student Name, ID, Age,mathsmarks:");
		Student stu = new Student();
		Student max = new Student(80);
		Student min = new Student("60", );
		for (int i = 0; i < n; i ++) {
			stu.name = in.next();
			stu.stu_id = in.next();
			stu.age = in.nextInt();
      stu.mathsmarks = in.nextIn();
			if (max.score < stu.score) {
				max.name = stu.name;
				max.stu_id = stu.stu_id;
				max.score = stu.score;
			}
			if (min.score > stu.score) {
				min.name = stu.name;
				min.stu_id = stu.stu_id;
				min.score = stu.score;
			}
		}
		in.close();
	}
}
