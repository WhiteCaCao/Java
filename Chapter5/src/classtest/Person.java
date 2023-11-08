package classtest;

public class Person {
	String name; // 이름
	int height; // 키
	int weight; // 몸무게
	char gender; // 성별
	boolean married; // 결혼여부
	
	// Person 생성자 작성하기
	// 기본생성자
	public Person(){}
	
    // Person 가지고 있는 모든 멤버변수의 데이터를 설정하는 생성자
//	Person lim = new Person("임꺽정", 180, 80, 'M', true);
//	lim.showPersonInfo();
	public Person(String name, int height, int weight, char gender, boolean married ) {
	// this.(멤버변수랑 같은 변수) = (파라미터랑 같은 변수);
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.married = married;
	}
	void showPersonInfo() {
		System.out.println(add(10,20));
		System.out.println(name +","+ height +","+ weight +","+ gender +","+ married);
	}
	// 반환 자료형 메서드명(매개변수){
    //		실행문;
    //		return 반환값;
    //    }
	// void : 값을 반환하지 않을때 사용
	int add(int x, int y){
		int result = x+y;
		return result;
	}
}

