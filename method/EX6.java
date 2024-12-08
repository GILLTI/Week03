package method;
//다른 자료형 2개를 매개변수로 받는 메서드 정의
public class EX6 {	
	
	void introduce(String name, int age) {
			System.out.println("제 이름은" + name + "입니다, 나이는" + age + "세 입니다"); //기능을 수행할 코드
	}
	
	void hello() {
		System.out.println("안녕하세요");
	}
	
//다른 자료형 2개를 매개변수로 받는 메서드 호출
	public static void main(String[] args) {
		EX6 hong = new EX6();			//객체생성
		hong.introduce("홍길동", 20);		//hong 인스턴스 introduce메서드 호출
		hong.hello();
	}
	
}
