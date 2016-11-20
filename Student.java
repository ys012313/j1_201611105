import java.util.ArrayList;
import java.util.Collections;

class Student{
	private String name;
	private int StudentNum;
	public void Student(String name, int sNum) {
		this.name=name;
		this.StudentNum=sNum;
	}
	
	public String getName() {
		return name;
	}
	
	public static void main(String[] argv){
		ArrayList<String> StudentNameList=new ArrayList<String>();
		Student s1 = new Student("JSH",201611105);
		Student s2 = new Student("Jhs",201611103);
		StudentNameList.add(s1.getName());
		StudentNameList.add(s2.getName());
		Collections.sort(StudentNameList);
		System.out.println(StudentNameList);
	}
}