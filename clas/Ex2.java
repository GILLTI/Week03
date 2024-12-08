package clas;

public class Ex2 {//클래스 선언
		public static void main(String[] args) {
				Car c = new Car();	//Car클래스를 이용해서 객체생성
				System.out.println("wheel의 개수는" + c.wheel + "개입니다");// 필드 값 출력
				
				c.wheel = 5;//c객체의 데이터인 wheel의 값을 5로 변경
				System.out.println("wheel의 개수는 " + c.wheel + "개입니다.");
		}
}
