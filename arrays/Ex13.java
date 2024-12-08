package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Ex13 {
	public static void main(String[] args) {

		
		int[] card = {3,1,4,5,10};	//card 배열 선언
		int[] newCard = Arrays.copyOf(card,card.length);	
		//newCard배열에card배열의 길이만큼 복사
		
		System.out.println("card 배열 : " + Arrays.toString(card));
		
		card[1] = 10;
		//card 배열 값 변경
		
		
		System.out.println("card 배열" + Arrays.toString(card));
		System.out.println("newCard 배열" + Arrays.toString(newCard));
		//card 변경 후 배열 출력
		
	}

}
