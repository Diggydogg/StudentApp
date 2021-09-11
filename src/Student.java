
public class Student implements Comparable<Student>{
	int no;
	String name;
	int age;
	
	
	public Student() {
		super();
	}
	public Student(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}



	@Override 
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
}
