package arrays;
//2차원 배열 활용
import java.util.Arrays;
import java.util.Comparator;

public class Ex15 {
	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		//행과 열을 지정하여 선언
		
		int count = 1;
		
		for(int i =0; i <5; i++) {
			for(int j = 0; j < 5; j++) {
				arr[i][j] = count++;
				//1부터 25까지 차례대로 배열에 값을 넣는다
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + "");
			}
			System.out.println();
		}
		
		
	}

}
