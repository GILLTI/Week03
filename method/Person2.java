package method;

public class Person2 {
	private int age;	//Person2클래스에서만 접근 가능한 age 필드 선언

void setAge(int num) {
	if(num <= 0) {	//만약, age에 넣으려는 값이 0보다 작거나 닽다면
					//값이 잘못되었슴을 출력하여 알려준다
		System.out.println("잘못된 수를 입력하셨습니다. 1이상의 값으로 설정하세요.");
		return;	//메서드 종료
		
	}else {
		age = num;	//age필드에 num 값 저장
	}
}
	int getAge() {
			return age;
	}
}

