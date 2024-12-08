package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Ex12 {
	public static void main(String[] args) {

		
		int[] card = {1,6,4,5,3,2};	//card 배열 선언
		int[] newCard = new int[card.length];	//card배열을 복사할 배열을 선언합니다.
		
		for(int i = 0; i < card.length; i++) {//새로운 배열에 기존 내용을 삽입
			newCard[i] = card[i];
		}
		
		System.out.println("card 배열" + Arrays.toString(card));
		System.out.println("newCard 배열" + Arrays.toString(newCard));
		
	}

}
