package method;
//매개변수가 있는 매서드 정의
public class EX4 {	
	
	void count(int bookNum) {
			System.out.println("책은" + bookNum + "권 입니다.");
	}
//매개변수가 있는 매서드 호출
	public static void main(String[] args) {
		EX4 myBook = new EX4(); //객체 생성
		myBook.count(3);//myBook 인스턴스 count 메서드 호출
	}
		
}
