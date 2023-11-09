package statictest;

public class StudentTest3 {

	public static void main(String[] args) {
		// 학생마다 각각 다른 학생카드가 발급되며 카드번호는 학생번호에 100을 더한 값
		// 학생이 생성 될때마다 자동으로 학생카드의 값도 설정되도록 만들어 보세요
		Student lee = new Student();
		System.out.println(lee.studentID+","+ lee.cardNum);
		
		Student kim = new Student();
		System.out.println(kim.studentID+","+ kim.cardNum);
		
		for(int i=1; i<=100; i++) {
			Student ahn = new Student();
			System.out.println("학생 번호 = "+ahn.studentID);
			System.out.println("학생 카드번호 = "+(ahn.cardNum));
		}
	}

}
