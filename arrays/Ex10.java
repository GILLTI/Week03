package arrays;

import java.util.Arrays;
import java.util.Comparator;	


public class Ex10 {
	public static void main(String[] args) {
		
		
			
			Integer[] arr = {1,6,2,3,10,7,4,5,8,9};
			//클래스 형태의 정수형 데이터 배열을 선언
				
				System.out.println("정렬 전 배열 :" + Arrays.toString(arr));	//Attays.toString은 배열을 하나의 문자열로 추출
				
				//배열의 오름차순 정렬
				Arrays.sort(arr, Comparator.reverseOrder());
				//Comparator 클래스의 reverseOrder() 메서드 이용해 정렬
				
				System.out.println("내림차순 정렬 : " + Arrays.toString(arr));
			
		}
		
		
			}

