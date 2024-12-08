package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11 {
	public static void main(String[] args) {

		int[] arr01 = { 1, 2, 3 };

		int[] arr02 = arr01;
		// 배열의 얕은 복사

		System.out.println("arr01 배열 : " + Arrays.toString(arr01));

		arr02[1] = 10;
		// arr02 배열 값 변경

		System.out.println("arr02 배열 :" + Arrays.toString(arr01));
		System.out.println("arr01 배열 :" + Arrays.toString(arr02));
	}

}
