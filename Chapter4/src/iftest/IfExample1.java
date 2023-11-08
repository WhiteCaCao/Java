package iftest;

public class IfExample1 {

	public static void main(String[] args) {
		// tab 키로 들여쓰기, {}중괄호 안에는 반드시 한칸 들여쓰기를 할 것
		// shift + tab : 반대로 들여쓰기
		// ctrl + shift + f : 자동 줄 맞춤 기능
//		if(조건식 : true, false가 출력되는 내용) {
//			실행문;
//			} else {
//				실행문;
//			}
		int i = 11;
		int j = 15;
		if(i>10) {
			System.out.println("i는 10보다 크다");
		} if(j>10) {
			System.out.println("j는 10보다 크다");
		}
		
		if (i < j) {
			String str = "i는 j보다 작습니다.";
			System.out.println(str);
		} else if(i > j) {
			String str = "i는 j보다 큽니다.1";
			System.out.println(str);
		} else if(i > j) {
			String str = "i는 j보다 큽니다.2";
			System.out.println(str);
		} else if(i > j) {
			String str = "i는 j보다 큽니다.3";
			System.out.println(str);
		} else if(i > j) {
			String str = "i는 j보다 큽니다.4";
			System.out.println(str);
		} else {
			String str = "i는 j와 같습니다.";
			System.out.println(str);
		} 
		
		
		
		
		System.out.println("프로그램이 종료되었습니다.");
		
	}

}
