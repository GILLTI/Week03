package method;
//리턴으로 매서드 빠져나가기
public class EX10 {	
	
		void take (int m) {
			//return;이 나올 때까지 무한 반복
			while(true) {
				if(m < 3000) {
					System.out.println("교통카드를 충전하러 갑니다.");
					return; //메소드종료 의미 = break;와 동일
				}
				System.out.println("버스를 탑니다");
				m -= 1250;
			}
	}
	
	public static void main(String[] args) {
		int money = 10000;
		
		EX10 bus = new EX10(); //객체생성
		bus.take(money);		//bus 인스턴스의 take 메서드 호출
	}
	//return문을 통해 무한 루프를 돌고있는 while과 take()메서드를 완전히 종료시키고 빠져나왔다.
}
