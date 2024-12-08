package method;

public class EX1 {
		public static void main(String[] args) { //Ex01클래스 안에서 호출
			printHello(); // main 매서드 안에서 printHello() 메서드 호출
		}
		
		 static void printHello() { //static : 정적 멤버로 선언합니다 
			 						//void : 반환할 결과가 없을 때, void라고 명시합니다
			 						//printHello() : 해당 메서드를 호출하기 위해 메서드명을 사용합니다.
			 
			System.out.println("안녕하세요"); 
			System.out.println("만나서 방갑습니다"); 
		 }
}
