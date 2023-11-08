package iftest;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		// 성적에 따라 학점 부여하기
		// 100~90점 : A
		// 89~80점 : B
		// 79~70점 : C
		// 69~60점 : D
		// 그 외 : F
		
		System.out.println("점수를 입력해주세요.>>");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt(); // 점수를 입력받을 변수
		String grade = ""; // A~F 학점을 저장하는 변수
		if (score >= 90) {
			grade = "A";
		}	else if (score >=80) {
			grade = "B";
		}	else if (score >=70) {
			grade = "C";
		}	else if (score >=60) {
			grade = "D";
		}	else {
			grade = "F";
		}
		System.out.println(score == 70);  // == 은 같은게 맞아도 false가 나오는 경우가 있기 때문에
		System.out.println(grade.equals("F")); // "String 을 비교할때는 반드시 equals() 써서 비교할 것" 
		System.out.println("학점은 " + grade + " 입니다.");
		if(grade.equals("F")) {
			System.out.println("열공이 필요합니다.");
			
			
		}
				
	}
}	
