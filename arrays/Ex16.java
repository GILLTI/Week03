package arrays;
import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {

		int[][] lotto = {{2,6,11,33,42,44},
						{1,6,17,22,24,33},
						{7,16,24,33,42,44},
						{11,27,32,34,43,46},
						{6,17,22,24,33,41}};	
		//행과 열을 지정하여 선언
		
		Scanner scan = new Scanner(System.in);	//입력메소드
		String myNum = "";
		System.out.println("당첨 숫자 6개를 연속으로 입력해주세요 >>");
		myNum = scan.next();
		
		boolean isWin = false;
		//당첨 여부를 나타내는 변수
		
		for(int i = 0; i < lotto.length; i++) {//당첨 번호를 만들기 위한 변수
			String lottoNumber = "";	//한행의 번호를 더해서 하나의 숫자로 만든다
			for(int j = 0; j < lotto[i].length; j++) {
				lottoNumber += lotto[i][j];
			}
			if(myNum.equals(lottoNumber)) {
				isWin = true;
				break;
			}
			
		}
			
			if(isWin) {
				System.out.println(myNum + "번호 당첨!!");
			}else {
				System.out.println(myNum + " 번호는 당첨되지 못했습니다.");
			}
			scan.close();
			
			
		
	}

}
