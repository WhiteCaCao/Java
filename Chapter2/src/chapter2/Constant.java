package chapter2;

public class Constant {

	public static void main(String[] args) {
		// 상수는 한번 초기화한 값을 변경할 수 없음
		//literal(= 다음 오는거)  
		final int VALUE = 0;
		System.out.println(VALUE);
		
		final double PI;
		PI = 3.14;
		System.out.println(PI);
		final int MIN_NUM = 0;
		final int MAX_NUM = 2100000000;
		final String MESSAGE = "내일은 화창한 날입니다.";
		System.out.println(MESSAGE);
		System.out.println(MESSAGE);
		System.out.println(MESSAGE);
		System.out.println(MESSAGE);
		System.out.println(MESSAGE);
		System.out.println("내일은 화창한 날입니다.");
		System.out.println("내일은 화창한 날입니다.");
		System.out.println("내일은 화창한 날입니다.");
		System.out.println("내일은 화창한 날입니다.");
		System.out.println("내일은 화창한 날입니다.");
	}
	

}