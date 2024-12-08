package method;
//리던한 값을 변수에 저장하는 메서드 정의
public class EX9 {	
	
	public int score(int [] score) {
			int result = 0;
			for(int i = 0; i < score.length; i++) {
				result += score[i];		//매개변수로 받은 배열의 요소 값을 하나씩 result 값에 더한다
			}
			
		
			return result;
		
	}
	
//리턴한 값을 변수에 저장하는 메서드 호출
	public static void main(String[] args) {
		int studentA[] = {97, 53};	//배열생성
		int studentB[] = {95, 66};	//배열생성
		
		
		EX9 mid = new EX9();			//객체생성
		int sumA = mid.score(studentA);	//메서드를 호출한 결과값을 sumA에 저장
		int sumB = mid.score(studentB);	//메서드를 호출한 결과값을 sumB에 저장
		
		
		if(sumA > sumB) {
			System.out.println("A학생의 중간고사 총점이 더 높습니다.");
			} else if(sumA < sumB) {
				System.out.println("B학생의 중간고사 총점이 더 높습니다.");
			} else {	//sumA == sumB
				System.out.println("두 학생의 중간고사 총점이 같습니다.");
			}
	//결과 값을 저장할 변수의 자료형은 결과값의 자료형과 동일하거나 자동 형 변환이 될 수 있는 자료형이어야 한다
	}
}
