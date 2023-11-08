package operator;

public class OperatorTest {

	public static void main(String[] args) {
		// = : 대입 연산자, 변수에 값을 대입하는 역할
		int i = 24;
		// +, - 부호 연산자
		i = +1;
		i = -1;
		// +-*/% : 산술연산자
		i = 1+2; // 3
		System.out.println(i);
		i = 1-2; // -1
		System.out.println(i);
		i = 10*2; // 20
		System.out.println(i);
		i = 10/2; // 5
		System.out.println(i);
		i = 13%2; // 1
		System.out.println(i);
		
		// ++. -- : 증가 감소 연산자
		// ++를 변수의 앞에 붙였을 경우 먼저 +1한 결과값이 출력.
		// ++를 변수의 뒤에 붙였을 경우 결과값이 출력된 후 +1이 계산.
		i = 200;
        i /*201*/ = ++i;//200 (i에 1을 더한값을 출력) 
		System.out.println(i); //201
        // i++; // (= i+1;)
		int j = i++ + 10; // j=211 i=202 (1을 더하기 전 계산 된 값이 j에 저장된 후 i값이 1증가)
		System.out.println(i);
		//
		
	}


}
