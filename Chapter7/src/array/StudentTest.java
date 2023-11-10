package array;


public class StudentTest {

	public static void main(String[] args) {
		// student 클래스를 만들고 멤버 변수로 studentID, studentName 을 선언
		// StudentArr 배열에 1001, tomas 1002,James 1003,Edward 를 저장하고 출력
	
		Student2[] studentArr = new Student2[3];
		studentArr[0] = new Student2(1001, "tomas");
		studentArr[1] = new Student2(1002, "James");
		studentArr[2] = new Student2(1003, "Edward");
	
		for(int i=0; i<studentArr.length; i++) {
			studentArr[i].showInfo();
		}
		
	}
	
}

