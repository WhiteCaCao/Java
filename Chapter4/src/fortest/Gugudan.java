package fortest;

public class Gugudan {

	public static void main(String[] args) {
		// for문을 이용하여 구구단 출력하기
		// 2단에서 9단까지
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j); //*대신 산술+를 사용할때는 ()괄호 해주면 된다
			}
		} 

	}

}
