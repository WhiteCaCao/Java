package array;

public class Alphabet {

	public static void main(String[] args) {
		// 이차원 배열 char[][] 안에
		// 알파벳 소문자를 2글자씩 13줄로 출력하는 프로그램 작성
		char [][] alphabet = new char [13][2];
		char a ='a';
		
		for(int i=0; i<alphabet.length; i++) {
			for(int j=0; j<alphabet[i].length; j++) {
				alphabet[i][j]= a;
				a++;
				System.out.print(alphabet[i][j]);
			}
			System.out.println();
		}
	}

}
			

     