package addition;

public class Student {
	
	int id ;
	String name ;
	static String collegeName="Govt college";
		
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
			
	}

	public Student(int id) {
		this.id = id;
	}
	
	public static void main(String[] args) {	
		
		Student s10=new Student(10);
		Student s1=new Student(1);
		Student s2=new Student(2);
		Student s3=new Student(3);
		Student s4=new Student(4);
		Student s5=new Student(5);
		Student s6=new Student(6);
		
		System.out.println(s1.id+"  "+ s1.name+"  "+ Student.collegeName+"  "+ s2.id+"  "+ s2.name+"  "+ s2.collegeName);
		
		
		

		
		
	}
}
