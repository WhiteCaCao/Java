package operator;

public class OperatorTest2 {

	public static void main(String[] args) {
		// >,<,>=,<=,==,!= 관계연산자, 비교연산자
		int num1 = 2;
		int num2 = 2;
		System.out.println(num1>num2); // 항1>항2 항1이 항2 보다 작다
		System.out.println(num1<num2);
		System.out.println(num1>=num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2); // 같다
		System.out.println(num1!=num2); // 다르다
		System.out.println("----------------");
		// &&, ||, ! : 논리 연산자
		System.out.println(true && true); // 두 개의 항이 모두 true일때 true 출력(AND)
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(true || true); // 두 개의 항 중 하나라도 true일때 true 출력(OR)
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
	
	    System.out.println(!true);
	    System.out.println(!false);
	}

}
