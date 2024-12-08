package constructor;

public class Ex3 {
	public static void main(String[] args) {
		
		Person p1 = new Person("김자바", 20);	//객체 생성 및 초기화
		Person p2 = new Person("이코딩", 40);	//객체 생성 및 초기화
					
		p1.introduce();				//객체 메서드 호출
		p2.introduce();				//객체 메서드 호출
		
	}
	
	
}
