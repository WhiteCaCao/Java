package switchtest;

public class SwitchTest1 {

	public static void main(String[] args) {
		/*switch(변수) {
			case : 비교하고싶은 값:
				실행문;
				break;
				default :
					실행문;
					(break;)
	}*/
		int ranking = 1;
		char medalColor;
		switch(ranking ) {
			case 1 :
				medalColor = 'G';
				break;
			case 2 :
				medalColor = 'S';
				break;
			case 3 :
				medalColor = 'B';
				break;
			default :
				medalColor = 'A';
//				System.out.println(ranking + "등의 메달 색은" + medalColor + "입니다."); <-1~3등은 break때문에 출력 안됨
			}
		System.out.println(ranking + "등의 메달 색은" + medalColor + "입니다."); //<-모든 등수에 대한 출력이 나옴
	}
}
