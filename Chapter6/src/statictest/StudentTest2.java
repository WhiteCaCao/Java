package statictest;

public class StudentTest2 {

	public static void main(String[] args) {
		Student lee = new Student();
		System.out.println(lee.studentID);
		
		Student kim = new Student();
		System.out.println(kim.studentID);
		
		for(int i=1; i<=100; i++) {
			Student ahn = new Student();
			System.out.println(ahn.studentID);
		}
	}

}
