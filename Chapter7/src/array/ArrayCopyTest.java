package array;

import java.util.Arrays;

public class ArrayCopyTest {

	public static void main(String[] args) {
		int [] arr1 = {10, 20, 30, 40, 50};
		int [] arr2 = {1, 2, 3, 4, 5};
		for(int i=1; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
					// (복사할대상,시작 인덱스, 복사결과 대상, 결과대상의 시작 인덱스, 복사 갯수)
		System.arraycopy(arr1, 1, arr2, 1, 4);
		System.out.println("arr 1 : "+Arrays.toString(arr1));
		System.out.println("arr 2 : "+Arrays.toString(arr2));
	}

}
