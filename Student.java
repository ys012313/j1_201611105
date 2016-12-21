import java.util.*;

public class Student {
	private String name;
	private int studentNum;
	Student (String name, int sNum) {
		this.name = name;
		studentNum = sNum;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		ArrayList<String> studentNameList = new ArrayList<String>();
		Student s1 = new Student("sh 1",1);
		Student s2 = new Student("sh 3",5);
		Student s3 = new Student("sh 5",4);
		Student s4 = new Student("sh 2",2);
		Student s5 = new Student("sh 4",3);
		studentNameList.add(s1.getName());
		studentNameList.add(s2.getName());
		studentNameList.add(s3.getName());
		studentNameList.add(s4.getName());
		studentNameList.add(s5.getName());
		Collections.sort(studentNameList);
		System.out.println(studentNameList);
	}
}