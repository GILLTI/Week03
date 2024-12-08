package method;
//EX3클래스에 이름을 저장하는 필드 name를 선언하고 이름을 출력하는 메서드를 선언한 후 출력
public class EX3 {	
	
	
		String name;	//조거의 이름
		
		void run() {
			System.out.println("run run run!");
		}
		
		void sayName() {
			//필드를 이용해 아래 문장 출력
			System.out.println("제 이름은" + name + "입니다");
		}
	
	public static void main(String[] args) {
		EX3 jogger = new EX3(); //객체생성
		jogger.name = "홍길동";
		jogger.sayName(); //jogger인스턴스의 sayName() 메서드 호출
		jogger.run();	//jogger 인스턴스 run() 메서드 호출
		
	}	
		
		
}
