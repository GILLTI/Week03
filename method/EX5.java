package method;
//매개변수가 2개 이상인 메서드 정의
public class EX5 {	
	
	void sum(int num1, int num2) {
			System.out.println("두수의 합은 " + (num1 + num2) + "입니다."); //기능을 수행할 코드
		
	}
	
//매개변수가 2개 이상인 메서드 호출
	public static void main(String[] args) {
		EX5 calc = new EX5();	//객체생성
		calc.sum(5, 3);		//calc 인스턴스 sum 메서드 호출
		calc.sum(10, 7);	//calc 인스턴스 sum 메서드 호출
	}
	
}
